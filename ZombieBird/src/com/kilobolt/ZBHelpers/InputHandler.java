package com.kilobolt.ZBHelpers;

import java.util.List;

import com.badlogic.gdx.InputProcessor;
import com.kilobolt.GameObjects.Bird;
import com.kilobolt.GameWorld.GameWorld;
import com.kilobolt.ui.SimpleButton;

public class InputHandler implements InputProcessor {

	private Bird myBird;
	private GameWorld myWorld;
	
	private List<SimpleButton> menuButtons;
	
	private float scaleFactorX;
	private float scaleFactorY;
	
	// Ask for a reference to the Bird when InputHandler is created
	public InputHandler(GameWorld myWorld){
//		public InputHandler(GameWorld myWorld, float scaleFactorX, float scaleFactorY){
		// myBird now represents the gameWorld's bird
		this.myWorld = myWorld;
		myBird = myWorld.getBird();
		
//		int midPointY = myWorld.getMidPointY();
		
		this.scaleFactorX = scaleFactorX;
		this.scaleFactorY = scaleFactorY;
		
//		menuButtons = new ArrayList<SimpleButton>();
//		playButton = new SimpleButton(136/2-(AssetLoader.playButtonUp.getRegionWidth()/2),)
		
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		if(myWorld.isReady()){
			myWorld.start();
		}
		
		myBird.onClick();
		
		if(myWorld.isGameOver() || myWorld.isHighScore()){
			//Reset all variables, go to GameState.READ
			myWorld.restart();
		}
		
		return true;
	
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
