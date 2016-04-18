package com.rpsg.rpg.system.ui;

import java.util.ArrayList;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.rpsg.gdxQuery.$;
import com.rpsg.rpg.core.Setting;
import com.rpsg.rpg.object.rpg.Hero;
import com.rpsg.rpg.system.base.Res;
import com.rpsg.rpg.utils.game.GameUtil;

public class HeroStatusGroup extends Group {

	public HeroStatusGroup(ArrayList<Hero> heros) {
		$.add(Res.get(Setting.UI_BASE_IMG).size(GameUtil.screen_width,115).color(0,0,0,.5f)).setPosition(0, 28).appendTo(this);
		for(int i = 0; i < heros.size(); i++)
			addActor($.add(new HeroStatusBox(heros.get(i)).position(i * 256, 28)).getItem());
	}
	
	public HeroStatusBox getBox(Hero hero){
		HeroStatusBox box = null;
		
		for(Actor actor : $.add(this).children().getItems())
			if(((HeroStatusBox)actor).hero == hero)
				box = ((HeroStatusBox)actor);
		
		return box;
	}
}
