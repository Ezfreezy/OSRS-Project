package customapi;

import org.tribot.api.interfaces.Clickable07;
import org.tribot.api.interfaces.Positionable;
import org.tribot.api.types.generic.Filter;
import org.tribot.api.util.abc.ABCUtil;
import org.tribot.api2007.Objects;
import org.tribot.api2007.Player;
import org.tribot.api2007.Projection;
import org.tribot.api2007.types.RSCharacter;
import org.tribot.api2007.types.RSNPC;
import org.tribot.api2007.types.RSObject;
import org.tribot.api2007.types.RSTile;

public class Antiban2 extends ABCUtil {
 
 public Boolean should_hover = null;
 public Boolean should_menu = null;
 public Boolean should_anticipate = null;
 
 public Positionable next_target = null;
 public Positionable next_target_closest = null;
 
 
 public void resetHover() {
  this.should_hover = null;
 }
 
 public void resetOpenMenu() {
  this.should_menu = null;
 }
 
 public void resetAnticipate() {
  this.should_anticipate = null;
 }
 
 @Override
 public boolean shouldHover() {
  if (this.should_hover != null)
   return this.should_hover;
  
  return this.should_hover = super.shouldHover();
 }
 
 @Override
 public boolean shouldMoveToAnticipated() {
  if (this.should_anticipate != null)
   return this.should_anticipate;
  
  return this.should_anticipate = super.shouldMoveToAnticipated();
  
 }
 
 @Override
 public boolean shouldOpenMenu() {
  if (this.should_menu != null)
   return this.should_menu;
  
  return this.should_menu = super.shouldOpenMenu();
 }
 
 public int generatingReactionTimes(boolean under_attack, boolean fixed_waiting) {
  final int reaction_time = super.getProperties().getWaitingTime();
  
  super.getProperties().setWaitingTime(reaction_time);
  super.getProperties().setMenuOpen(shouldOpenMenu() && shouldHover());
  super.getProperties().setHovering(shouldHover());
  super.getProperties().setUnderAttack(under_attack); // ADD LAST ATTACKED TIME
  super.getProperties().setWaitingFixed(fixed_waiting);
  
  return super.generateReactionTime();
 }
 
 public void generatingTrackers(int est_waiting, boolean inCombat) {
  super.getProperties().setWaitingTime(est_waiting);
  super.getProperties().setUnderAttack(inCombat);
  super.getProperties().setWaitingFixed(false);
  
  super.generateTrackers();
 }
 
 @Override
 public void sleep(long reaction_time) {
  try {
   super.sleep(reaction_time);
  }
  catch (final InterruptedException e) {
   System.out.println("Background thread interrupted sleep");
  }
 }
 
 private boolean isNextTargetValid(final Positionable[] possible_targets) {
  final RSTile pos = this.next_target.getPosition();
  if (pos == null)
   return false;

  if (!Projection.isInViewport(Projection.tileToScreen(pos, 0)))
   return false;

  if (this.next_target instanceof Clickable07 && !((Clickable07) this.next_target).isClickable())
   return false;

  if (this.next_target instanceof RSNPC && !((RSNPC) this.next_target).isValid() || ((RSNPC) next_target).isInCombat())
   return false;

  if (this.next_target instanceof RSCharacter) {
   final String name = ((RSCharacter) this.next_target).getName();
   if (name == null || name.trim().equalsIgnoreCase("null"))
    return false;
  }

  if (this.next_target instanceof RSObject) {
   if (!Objects.isAt(this.next_target, new Filter<RSObject>() {

    @Override
    public boolean accept(final RSObject o) {
     return o.obj.equals(((RSObject) next_target).obj);
    }

   }))
    return false;
  }

  
  if (possible_targets != null && possible_targets.length > 0 && this.next_target_closest != null) {
   final RSTile new_closest_tile = possible_targets[0].getPosition();
   final RSTile orig_closest_tile = this.next_target_closest.getPosition();
   final RSTile player_pos = Player.getPosition();

   if (new_closest_tile != null && orig_closest_tile != null && player_pos != null) {
    final double new_closest_dist = new_closest_tile.distanceToDouble(player_pos);
    final double orig_closest_dist = orig_closest_tile.distanceToDouble(player_pos);

    
    if (new_closest_dist < orig_closest_dist)
     return false;
   }
  }

  return true;
 }
 
 @Override
 public Positionable selectNextTarget(final Positionable[] possible_targets) {
  try {
   if (this.next_target != null && isNextTargetValid(possible_targets))
    return this.next_target;

   return this.next_target = super.selectNextTarget(possible_targets);
  } finally {
   if (this.next_target != null && possible_targets.length > 0)
    this.next_target_closest = possible_targets[0];
  }
 }
 
 public void resetNextTarget() {
  this.next_target = null;
  this.next_target_closest = null;
 }
 
 
 
 @Override
 public void checkTabs() {
  if (super.shouldCheckTabs()) {
   System.out.println("Checking Tabs");
   super.checkTabs();
  }
 }
 
 @Override
 public void checkXP() {
  if(super.shouldCheckXP()) {
   System.out.println("Checking XP");
   super.checkXP();
  }
 }
 
 @Override
 public void examineEntity() {
  if (super.shouldExamineEntity()) {
   System.out.println("Examining Entity");
   super.examineEntity();
  }
 }
 
 @Override
 public void leaveGame() {
  if (super.shouldLeaveGame()) {
   System.out.println("Leaving Game");
   super.leaveGame();
  }
 }
 
 @Override
 public void moveMouse() {
  if (super.shouldMoveMouse()) {
   System.out.println("Moving Mouse");
   super.moveMouse();
  }
 }
 
 @Override
 public void rightClick() {
  if (super.shouldRightClick()) {
   System.out.println("Right Clicking");
   super.rightClick();
  }
 }
 
 @Override
 public void rotateCamera() {
  if (super.shouldRotateCamera()) {
   System.out.println("Rotating Camera");
   super.rotateCamera();
  }
 }
 
 public void idleActions() {
  this.checkTabs();
  this.checkXP();
  this.examineEntity();
  this.leaveGame();
  this.moveMouse();
  this.rightClick();
  this.rotateCamera();
 }
}