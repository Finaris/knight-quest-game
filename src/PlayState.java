import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

import com.sun.media.sound.Toolkit;

public class PlayState extends JFrame 
{
	
	public static void main(String[] args)
	{
		
		String[] townName = {"Aysgarth", "Berkton", "Exeter", "Norbury", "Goldcrest"};
		String[] questName = {"The Pillar of Distress", "The Night of Nights", "The Pit of Darkness", "The Terror Within", "The Plague of the Lands"};
		String[] monsterName = {"Whelpling","Specter", "Drakonid"};
		String[] dragonName = {"Syrriolth the Insane", "Daganth the Dragonlord", "Rylarth the Mysterious", "Lusolth, Champion of the Red", "Sorventh the Dark"};
		String[] reward = {"Consecration, Staff of Timeless Battles", "Blazefury, Sword of the Inferno", "Witherbrand, Protector of the Gods", "Chimera, Longbow of Illuminated Dreams", "Nightglow, Warblade of the Forsaken"};
		
		String name = null;
		
		Town town = new Town("The Town", "The area before you bustles with life as various shops and stalls surround you. You notice a large town hall directly in front of you"
				+ " as you stand in the town square. Peddlers are seen begging people off the side, and you occasionally see people with animals pacing around you.", name,
				townName, questName);
		Cave cave = new Cave("The Cave", "A dark tunnel appears, and you cannot see far into the cave. The mouth of the cave is large, and you see various rock formations"
				+ "peeking out of the cave.", name, monsterName);
		Lair lair = new Lair("The Lair", "A hollow cavern appears, and light shines through a crack in the top of the niche. You see a large, forlorn beast resting."
				+ "It occasionally snarls out wisps of smoke, and after a few minutes it opens an eye. Once it notices you, it begins to stand out and stares you dead in"
				+ "the eyes, roaring whilst spewing out flame in your general direction.", name, dragonName, reward);
		
		
		
		Panels panel = new Panels();
		panel.getWindow();
		
	}
}
