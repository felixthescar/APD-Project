package main;

import java.awt.Graphics;
import java.awt.Rectangle;


public class EntityGameObject extends GameObject{
    protected Vector2<Float> velocity;

    public EntityGameObject(float x, float y, ID id){
        super(x, y, id);
        velocity = new Vector2<Float>(0f, 0f);
        Handler.getHandler().object.add(this);
    }

    public void handleVelocity(){
        x += velocity.getX();
        y += velocity.getY();
        
        x = Game.clamp(x, 0, Game.WIDTH-50);
        y = Game.clamp(y, 0, Game.HEIGHT-73);
        
    }

    @Override
    public void tick() {
        handleVelocity();
    }

    @Override
    public void render(Graphics g) {
        
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    public void changeVelocity(Vector2<Float> change){
        velocity.setX(velocity.getX() + change.getX());
        velocity.setY(velocity.getY() + change.getY());
    }

    public void setVelocity(Vector2<Float> newVelocity){
        velocity = newVelocity;
    }

    public Vector2<Float> getVelocity(){
        return velocity;
    }

}
//final version