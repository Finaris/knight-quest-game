import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Panels 
{
	private Random rand = new Random();
	private volatile Window window = new Window(main());											
	private Color lightGrey = new Color(215, 215, 215);
	private String name, numberGameString;
	private volatile String check;
	private Icon image, image2;
	private JButton one, two, three, four, five, six, seven;
	private boolean dragonSlain = false, 
			hasGoneToShop = false, 
			hasDoneCombat = false;
	private int numberGameInt, 
			numberGameRandomInt = rand.nextInt(10) + 1;
	private JLabel 
			playerHP, 
			enemyHP, 
			statusText,
			statusText2;
	private int playerHPint = 100,
			whelpHP = 25, 
			playerHPint2 = 150,
			specterHP = 125,
			wraithCurseCD = 0,
			playerHPint3 = 1000,
			dragonHP = 10000,
			modifier = 0,
			dragonBreathCD = 0,
			healCD = 0,
			GuardianCD = 0,
			ShatteringBlowCD = 0;
	private String playerHPString = String.valueOf(playerHPint);
	private String whelpHPString = String.valueOf(whelpHP);
	private String specterHPString = String.valueOf(specterHP);
	private String dragonHPString = String.valueOf(dragonHP);
	public static int sizeCheck = 0;
	
	public JPanel main()
	{
		JPanel main = new JPanel();
		check = "main";
		main.setBackground(lightGrey);
		Handler handles = new Handler();
		sizeCheck = 3;
		
		one = new JButton("Start ");
		two = new JButton("Patch Notes");
		three = new JButton("Exit   ");
		
		one.addActionListener(handles);
		two.addActionListener(handles);
		three.addActionListener(handles);
		
		image =  new ImageIcon(getClass().getResource("templar.jpg"));
		image2 = new ImageIcon(getClass().getResource("logoMain.jpg"));
		
		JLabel title = new JLabel(image2);
		title.setFont(new Font("Serif", Font.PLAIN, 45));
		JLabel mainPic = new JLabel(image);
		JLabel versionNum = new JLabel("v1.1.0");
		JLabel credit = new JLabel("Created and developed by Madelyn Torres");
		
		Box panel = Box.createVerticalBox();
		panel.add(title);
		panel.add(Box.createRigidArea(new Dimension(50, 50)));
		panel.add(one);
		panel.add(Box.createRigidArea(new Dimension(50,50)));
		panel.add(two);
		panel.add(Box.createRigidArea(new Dimension(50,50)));
		panel.add(three);
		panel.add(Box.createRigidArea(new Dimension(50,150)));
		panel.add(mainPic);
		panel.add(versionNum);
		panel.add(credit);
		
		main.add(panel);
		main.add(mainPic);
		return main;
	}
	
	public JPanel patchNotes()
	{
		JPanel patchNotes = new JPanel();
		check = "patchNotes";
		patchNotes.setBackground(lightGrey);
		Handler handles = new Handler();
		sizeCheck = 2;
		
		JLabel top =  new JLabel("Patch Notes v1.1.0");
		top.setFont(new Font("Serif", Font.PLAIN, 45));
		JLabel info1 = new JLabel("-Added patch notes feature");
		JLabel info2 = new JLabel("-Added new labels");
		JLabel info3 = new JLabel("-Added a loading screen for utility purposes");
		JLabel info4 = new JLabel("-Reduced the duration of Guardian of the Light from three to two turns");
		JLabel info5 = new JLabel("-Fixed some spelling mistakes and other misplaced words");
		JLabel info6 = new JLabel("-Cleaned up the credits screen");
		JLabel info7 = new JLabel("-Fixed a variety of bugs");
		JLabel info8 = new JLabel("-Removed heal from the final battle");
		JLabel info9 = new JLabel("-Made the Number Guessing Game keep the same number, rather than changing every try");
		
		one = new JButton("Return");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(top);
		panel.add(info1);
		panel.add(info2);
		panel.add(info3);
		panel.add(info4);
		panel.add(info5);
		panel.add(info6);
		panel.add(info7);
		panel.add(info8);
		panel.add(info9);
		panel.add(Box.createRigidArea(new Dimension(100,250)));
		panel.add(one);
		
		patchNotes.add(panel);
		return patchNotes;
	}
	
	public JPanel prologue()
	{
		JPanel prologue = new JPanel();
		prologue.setBackground(lightGrey);
		check = "prologue";
		sizeCheck = 2;
		
		image = new ImageIcon(getClass().getResource("chapel.jpg"));
		
		JLabel prologue1 = new JLabel("Knight Quest");
		JLabel prologue2 = new JLabel(" ");
		JLabel prologue3 = new JLabel("You tread into the city of " + Town.getTownName() + " on a glum evening, approaching");
		JLabel prologue4 = new JLabel("a large structure that houses the renowned Templar's Verdict. You recount your various");
		JLabel prologue5 = new JLabel("travels in the land, being known as one of the strongest knights in history. This realm");
		JLabel prologue6 = new JLabel("has recently been plagued with a horrible evil, and the state has slowly beein going into");
		JLabel prologue7 = new JLabel("decline as the people lose faith, and various disappearances and killings have been seen");
		JLabel prologue8 = new JLabel("throughout the land. Knowing that you have dealt with countless horrors before, you know");
		JLabel prologue9 = new JLabel("that you are most likely one of the most promising knights to deal with the situation.");
		JLabel prologue10 = new JLabel("Alas, you walk in and see a gallant looking individual in chain mail armor, sitting at a desk");
		JLabel prologue11 = new JLabel("and furiously writing on parchment. Eventually, he notices you in the hallway and beckons");
		JLabel prologue12 = new JLabel("you over. He has a sly smile on his face and wrinkles around his eyes.");
		JLabel prologuePic = new JLabel(image);
		
		Handler handles = new Handler();
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(prologue1);
		panel.add(prologue2);
		panel.add(prologue3);
		panel.add(prologue4);
		panel.add(prologue5);
		panel.add(prologue6);
		panel.add(prologue7);
		panel.add(prologue8);
		panel.add(prologue9);
		panel.add(prologue10);
		panel.add(prologue11);
		panel.add(prologue12);
		panel.add(prologuePic);
		
		prologue.add(panel);
		prologue.add(one);
		return prologue;
	}
	
	public JPanel start()
	{
		
		JPanel start = new JPanel();
		start.setBackground(lightGrey);
		check = "start";
		
		image=  new ImageIcon(getClass().getResource("knight.jpg"));
		
		JLabel nameRequestDescription1 = new JLabel("\"Ahhh, well look at what we have here. Let me guess - another promising young");
		JLabel nameRequestDescription2 = new JLabel("knight prepared to take on our generation's greatest plight in hopes of");
		JLabel nameRequestDescription3 = new JLabel("reaping the spoils? In any case, we are thankful of your courage and");
		JLabel nameRequestDescription4 = new JLabel("appreciate you showing up. I am Athelard the Adamant, recruiting officer");
		JLabel nameRequestDescription5 = new JLabel("for the Templar's Verdict, defenders of this town.\"");
		JLabel nameRequestDescription6 = new JLabel("\"What is your name?\"");
		JLabel nameRequestPicture = new JLabel(image);
		
		Handler handles = new Handler();
		JTextField nameRequest = new JTextField("", 10);
		nameRequest.setFont(new Font("Serif", Font.PLAIN, 15));
		nameRequest.addKeyListener(handles);
		
		Box textboxPanel = Box.createVerticalBox();
		textboxPanel.add(nameRequestDescription1);
		textboxPanel.add(nameRequestDescription2);
		textboxPanel.add(nameRequestDescription3);
		textboxPanel.add(nameRequestDescription4);
		textboxPanel.add(nameRequestDescription5);
		textboxPanel.add(nameRequestDescription6);
		textboxPanel.add(nameRequest);

		start.add(nameRequestPicture);
		start.add(textboxPanel);
		return start;
	}
	
	public JPanel intro1()
	{
		JPanel intro = new JPanel();
		intro.setBackground(lightGrey);
		check = "intro1";
		
		image =  new ImageIcon(getClass().getResource("knight2.jpg"));
		
		JLabel introDescription1 = new JLabel("\"" + name + "... That sounds oddly familiar.\"");
		JLabel introDescription2 = new JLabel("Athelard begins pacing the room, as if each step he takes gets him closer to his answer.");
		JLabel introDescription3 = new JLabel("He suddenly pauses, slowly turns towards you, and kneels.");
		JLabel introDescription4 = new JLabel("\"I knew that name sounded too familiar. I hadn't believed the tales until");
		JLabel introDescription5 = new JLabel("now. You match every description of him.\"");
		JLabel introDescription6 = new JLabel("\"Oh " + name + ", the Templar's Verdict thanks you for coming to its aid. May your");
		JLabel introDescription7 = new JLabel("legendary talents assist us in vanquishing our foes.\"");
		JLabel introPicture = new JLabel(image);
		
		Handler handles = new Handler();
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box textboxPanel = Box.createVerticalBox();
		textboxPanel.add(introDescription1);
		textboxPanel.add(introDescription2);
		textboxPanel.add(introDescription3);
		textboxPanel.add(introDescription4);
		textboxPanel.add(introDescription5);
		textboxPanel.add(introDescription6);
		textboxPanel.add(introDescription7);
		
		intro.add(introPicture);
		intro.add(textboxPanel);
		intro.add(one);
		return intro;
	}
	
	public JPanel intro2()
	{
		JPanel intro2 = new JPanel();
		intro2.setBackground(lightGrey);
		check = "intro2";
		
		image = new ImageIcon(getClass().getResource("king.jpg"));
		
		JLabel introDescription1 = new JLabel("You are ushered through the halls of the building as you are led towards the leader");
		JLabel introDescription2a = new JLabel("of the Templar's Verdict. Eventually, you arrive at an ornate chair which is occupied");
		JLabel introDescription2b = new JLabel("by a worn, elder, and experienced man who dons a crown and a cane and scroll in either hand.");
		JLabel introDescription3 = new JLabel("Eventually, he utters, \"Greetings " + name + ", legendary knight of the land!");
		JLabel introDescription4 = new JLabel("It pleases me that you would come to " + Town.getTownName() + " in order to assist us.");
		JLabel introDescription5 = new JLabel("As I'm sure you are aware, a legendary beast has been lurking in the mountains near");
		JLabel introDescription6 = new JLabel(Town.getTownName() + ". Alas, it is your duty to venture out to the Caverns of Shadows");
		JLabel introDescription7 = new JLabel("and slay the beast. We can only send one as a powerful curse has been placed upon us where");
		JLabel introDescription8 = new JLabel("an increase in our numbers make us weaker when fighting the beast and his underlings.");
		JLabel introDescription9 = new JLabel("We have been coining this as " + Town.getQuestName() + ", but do with it what you will.");
		JLabel introDescription10 = new JLabel("I wish you luck " + name + ", you will greatly need it.\"");
		JLabel introPicture = new JLabel(image);
		
		Handler handles = new Handler();
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box list = Box.createVerticalBox();
		list.add(introDescription1);
		list.add(introDescription2a);
		list.add(introDescription2b);
		list.add(introDescription3);
		list.add(introDescription4);
		list.add(introDescription5);
		list.add(introDescription6);
		list.add(introDescription7);
		list.add(introDescription8);
		list.add(introDescription9);
		list.add(introDescription10);
		
		intro2.add(introPicture);
		intro2.add(list);
		intro2.add(one);
		return intro2;
	}
	
	public JPanel town1()
	{
		
		JPanel town1 = new JPanel();
		town1.setBackground(lightGrey);
		check = "town1";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("town.jpg"));
		
		JLabel townImage = new JLabel(image);
		JLabel description1 = new JLabel("You sleep in the building over night. Once you wake up, you venture out into the town square.");
		JLabel description2 = new JLabel("The area before you bustles with life, with various shops and stalls around you. You notice a");
		JLabel description3 = new JLabel("large town hall directly in front of you. As you stand in the square, peddlers are seen begging");
		JLabel description4 = new JLabel("on the side, and you occasionally see people with animals wandering around you.");
		
		one = new JButton("Visit the Elder");
		two = new JButton("Go to the Shop");
		three = new JButton("View Quest Log");
		four = new JButton(" Leave Area");
		
		one.addActionListener(handles);
		two.addActionListener(handles);
		three.addActionListener(handles);
		four.addActionListener(handles);
		
		Box panelDesc = Box.createVerticalBox();
		panelDesc.add(description1);
		panelDesc.add(description2);
		panelDesc.add(description3);
		panelDesc.add(description4);
		
		Box panel1 = Box.createHorizontalBox();
		panel1.add(Box.createRigidArea(new Dimension(0, 75)));
		panel1.add(one);
		panel1.add(Box.createRigidArea(new Dimension(75, 0)));
		panel1.add(three);
		
		Box panel2 = Box.createHorizontalBox();
		panel2.add(Box.createRigidArea(new Dimension(0, 75)));
		panel2.add(two);
		panel2.add(Box.createRigidArea(new Dimension(100, 100)));
		panel2.add(four);
		
		town1.add(townImage);
		town1.add(panelDesc);
		town1.add(panel1);
		town1.add(panel2);
		return town1;
		
	}
	
	public JPanel elderNotComplete()
	{
		JPanel elderNotComplete = new JPanel();
		elderNotComplete.setBackground(lightGrey);
		check = "elderNotComplete";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("king.jpg"));
		
		JLabel elder = new JLabel(image);
		JLabel elderSpeak1 = new JLabel("\"Greetings " + name + "! I see you have returned. I hope that you are doing");
		JLabel elderSpeak2 = new JLabel("well in your quest so far. I wish not to push you, but the state of the realm");
		JLabel elderSpeak3 = new JLabel("is steadily declining, and the quicker you can deal with it the better.");
		JLabel elderSpeak4 = new JLabel("Good luck " + name + ", and may you save " + Town.getTownName() + "!\"");
		
		one = new JButton("Return to Town");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(elderSpeak1);
		panel.add(elderSpeak2);
		panel.add(elderSpeak3);
		panel.add(elderSpeak4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		elderNotComplete.add(elder);
		elderNotComplete.add(panel);
		elderNotComplete.add(panelButton);
		return elderNotComplete;
	}
	
	public JPanel notShop()
	{
		JPanel notShop = new JPanel();
		notShop.setBackground(lightGrey);
		check = "notShop";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("forest.jpg"));
		
		JLabel notShopPic = new JLabel(image);
		JLabel notShop1 = new JLabel("You begin to leave " + Town.getTownName() + " and head out towards the Caverns of Shadows.");
		JLabel notShop2 = new JLabel("As you head out, you realize that, for the most part, your gear is inadequate for the adventure.");
		JLabel notShop3 = new JLabel("You stop in the middle of a worn down path and turn around, heading back to the town in order");
		JLabel notShop4 = new JLabel("to become well suited for the adventure at hand; who knows what you will face.");
		
		one = new JButton("Return to Town");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(notShop1);
		panel.add(notShop2);
		panel.add(notShop3);
		panel.add(notShop4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		notShop.add(notShopPic);
		notShop.add(panel);
		notShop.add(panelButton);
		return notShop;
	}
	
	public JPanel shop()
	{
		JPanel shop = new JPanel();
		shop.setBackground(lightGrey);
		check = "shop";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("shop.jpg"));
		
		JLabel shopPic = new JLabel(image);
		JLabel shop1 = new JLabel("You approach a cluster of shops, and at the back you notice one that appears to be rather");
		JLabel shop2 = new JLabel("large. You notice a single worker hammering some armor at a workbench. As you approach him,");
		JLabel shop3 = new JLabel("He looks up at you and waves you over. He has a scragged beard and long, aged hair.");
		JLabel shop4 = new JLabel("\"The name is Bernard!\" he exclaims while extending his hand out for a handshake.");
		JLabel shop5 = new JLabel("\"My name is " + name + ", nice to meet you! I am here looking for some of the finest armor");
		JLabel shop6 = new JLabel("and weapons that you have to offer.\" You say as you return the handshake. He looks up at you");
		JLabel shop7 = new JLabel("and starts laughing. \"Well dang! I'd never thought I'd meet you! Of course you can have it.\"");
		JLabel shop8 = new JLabel("Bernard pauses and looks at you. He then starts, \"Hey, what do you say we make a deal. If you");
		JLabel shop9 = new JLabel("can guess the number I am thinking of, 1 to 10, then I will give it to you for free.\"");
		JLabel shop10 = new JLabel("You consider the offer and accept.");
		
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shop1);
		panel.add(shop2);
		panel.add(shop3);
		panel.add(shop4);
		panel.add(shop5);
		panel.add(shop6);
		panel.add(shop7);
		panel.add(shop8);
		panel.add(shop9);
		panel.add(shop10);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		shop.add(shopPic);
		shop.add(panel);
		shop.add(panelButton);
		return shop;
	}
	
	public JPanel shop2()
	{
		JPanel shop2 = new JPanel();
		shop2.setBackground(lightGrey);
		check = "shop2";
		Handler2 handles = new Handler2();
		
		image = new ImageIcon(getClass().getResource("shop.jpg"));
		
		JLabel shop2Pic = new JLabel(image);
		JLabel shop21 = new JLabel("\"Alright\", he starts, \"I am thinking of a number from 1 to 10...\"                                        ");
		JLabel shop22 = new JLabel("What number do you pick?                                                                                     ");
		
		JTextField numberRequest = new JTextField("", 10);
		numberRequest.setFont(new Font("Serif", Font.PLAIN, 15));
		numberRequest.addKeyListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shop21);
		panel.add(shop22);
		
		Box panelBox = Box.createVerticalBox();
		panelBox.add(Box.createRigidArea(new Dimension(0, 50)));
		panelBox.add(numberRequest);
		
		shop2.add(shop2Pic);
		shop2.add(panel);
		shop2.add(panelBox);
		return shop2;
	}
	
	public JPanel shopWrong()
	{
		JPanel shopWrong = new JPanel();
		shopWrong.setBackground(lightGrey);
		check = "shopWrong";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("shop.jpg"));
		
		JLabel shopWrongPic = new JLabel(image);
		JLabel shopWrong1 = new JLabel("\"Alas, that is not the number I was thinking of,\" Bernard says.");
		JLabel shopWrong2 = new JLabel("\"However, out of my generosity, I will let you try once more.\"                                                           ");
		
		one = new JButton("Try Again!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shopWrong1);
		panel.add(shopWrong2);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(0, 50)));
		panelButton.add(one);
		
		shopWrong.add(shopWrongPic);
		shopWrong.add(panel);
		shopWrong.add(panelButton);
		return shopWrong;
	}
	
	public JPanel shopRight()
	{
		JPanel shopRight = new JPanel();
		shopRight.setBackground(lightGrey);
		check = "shopRight";
		hasGoneToShop = true;
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("shop.jpg"));
		
		JLabel shopRightPic = new JLabel(image);
		JLabel shopRight1 = new JLabel("\"Excellent! You got it! Well, I have to stick to my word. I will give you my strongest equipment.");
		JLabel shopRight2 = new JLabel("Mind you, this is mainly because your quest to slay " + Town.getQuestName() + " is an immediate");
		JLabel shopRight3 = new JLabel("threat. I wouldn't want people coming to me and saying random numbers for expensive items!\"");
		JLabel shopRight4 = new JLabel("Bernard starts cackling and motions one of his apprentices to get the items. In no time, they give");
		JLabel shopRight5 = new JLabel("it to you and Bernard stands up to shake your hand once again. You then leave the shop.");
		
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shopRight1);
		panel.add(shopRight2);
		panel.add(shopRight3);
		panel.add(shopRight4);
		panel.add(shopRight5);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(0, 50)));
		panelButton.add(one);
		
		shopRight.add(shopRightPic);
		shopRight.add(panel);
		shopRight.add(panelButton);
		return shopRight;
	}
	
	public JPanel shopDone()
	{
		JPanel shopDone = new JPanel();
		shopDone.setBackground(lightGrey);
		check = "shopDone";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("shop.jpg"));
		
		JLabel shopDonePic = new JLabel(image);
		JLabel shopDone1 = new JLabel("You begin walking towards the shop and realize that you have no more business there.");
		JLabel shopDone2 = new JLabel("You then start walking back towards the center of the town.                         ");
		
		one = new JButton("Return to Town");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shopDone1);
		panel.add(shopDone2);
		
		Box panelBox = Box.createVerticalBox();
		panelBox.add(Box.createRigidArea(new Dimension(0, 50)));
		panelBox.add(one);
		
		shopDone.add(shopDonePic);
		shopDone.add(panel);
		shopDone.add(panelBox);
		return shopDone;
	}
	
	public JPanel shopComplete()
	{
		JPanel shopComplete = new JPanel();
		shopComplete.setBackground(lightGrey);
		check = "shopComplete";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("forest.jpg"));
		
		JLabel shopCompletePic = new JLabel(image);
		JLabel shopComplete1 = new JLabel("You begin to leave " + Town.getTownName() + " and head out towards the Caverns of Shadows.");
		JLabel shopComplete2 = new JLabel("You walk on a worn down path towards the direction of the Caverns of Shadows. For the most part,");
		JLabel shopComplete3 = new JLabel("you feel well prepared. The total trip lasts 4 four days, after which you eventually stumble upon");
		JLabel shopComplete4 = new JLabel("a large cave which appears before you.                                                                  ");
		
		one = new JButton("Carry on!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(shopComplete1);
		panel.add(shopComplete2);
		panel.add(shopComplete3);
		panel.add(shopComplete4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		shopComplete.add(shopCompletePic);
		shopComplete.add(panel);
		shopComplete.add(panelButton);
		return shopComplete;
	}
	
	public JPanel cavern()
	{
		JPanel cavern = new JPanel();
		cavern.setBackground(lightGrey);
		check = "cavern";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("cave2.jpg"));
		
		JLabel cavernPic = new JLabel(image);
		JLabel cavern1 = new JLabel("A dark tunnel appears, and you cannot see far into the cave. The mouth of the cave is large, and");
		JLabel cavern2 = new JLabel("you see various rock formations peeking out of the cave. You raise the sword that the smith");
		JLabel cavern3 = new JLabel("gave you, and aim your shield in front of you. Your armor glistens in the entrance, and you");
		JLabel cavern4 = new JLabel("realize that your armor is enchanted to glow and give light as you travel through the cave.");
		
		one = new JButton("Enter the Cave");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(cavern1);
		panel.add(cavern2);
		panel.add(cavern3);
		panel.add(cavern4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		cavern.add(cavernPic);
		cavern.add(panel);
		cavern.add(panelButton);
		return cavern;
	}
	
	public JPanel innerCavern()
	{
		JPanel innerCavern = new JPanel();
		innerCavern.setBackground(lightGrey);
		check = "innerCavern";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("cave.jpg"));
		
		JLabel cavernInnerPic = new JLabel(image);
		JLabel cavernInner1 = new JLabel("You cautiously walk into the inner depths of the cave. The area reeks of rotten flesh");
		JLabel cavernInner2 = new JLabel("and you have been feeling a slight weight pressing down on your shoulderplates more and");
		JLabel cavernInner3 = new JLabel("more as you travel deeper into the cavern. Eventually, you pause as you hear something");
		JLabel cavernInner4 = new JLabel("approaching, as you turn a corner, a small green whelpling appears.                   ");
		
		one = new JButton("Begin Combat!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(cavernInner1);
		panel.add(cavernInner2);
		panel.add(cavernInner3);
		panel.add(cavernInner4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 50)));
		panelButton.add(one);
		
		innerCavern.add(cavernInnerPic);
		innerCavern.add(panel);
		innerCavern.add(panelButton);
		return innerCavern;
	}
	
	public JPanel innerBattle()
	{
		JPanel innerBattle = new JPanel();
		innerBattle.setBackground(lightGrey);
		check = "innerBattle";
		Handler3 handles = new Handler3();
		window.stopMusic();
		window.battleMusic();
		
		image = new ImageIcon(getClass().getResource("whelp.jpg"));
		
		one = new JButton("Attack!");
		one.addActionListener(handles);
		
		two = new JButton("Defend!");
		two.addActionListener(handles);
		
		three = new JButton("View Combat Details");
		three.addActionListener(handles);
		
		five = new JButton("Victory!");
		five.addActionListener(handles);
		five.setVisible(false);
		
		JLabel whelp = new JLabel(image);
		
		statusText = new JLabel("You have encontered a wild Emerald Whelpling!");
		
		playerHP = new JLabel("Player Health: 100");
		enemyHP = new JLabel("Whelpling Health: 25");
		
		Box panel = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panel.add(playerHP);
		panel.add(Box.createRigidArea(new Dimension(100, 100)));
		panel.add(enemyHP);
		
		Box panelButton = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panelButton.add(one);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(two);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(three);
		panelButton.add(five);
		
		Box statusPanel = Box.createVerticalBox();
		statusPanel.add(Box.createRigidArea(new Dimension(150, 50)));
		statusPanel.add(statusText);
		
		innerBattle.add(whelp);
		innerBattle.add(panel);
		innerBattle.add(panelButton);
		innerBattle.add(statusPanel);
		return innerBattle;
	}
	
	public JPanel lastCavern()
	{
		JPanel lastCavern = new JPanel();
		lastCavern.setBackground(lightGrey);
		check = "lastCavern";
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("dragon.jpg"));
		
		JLabel lastPic = new JLabel(image);
		JLabel last1 = new JLabel("A hollow cavern appears, and light shines through a crack in the top of cavern. You see a large,");
		JLabel last2 = new JLabel("forlorn dragon resting. It occasionally snarls out wisps of smoke, and after a few minutes it");
		JLabel last3 = new JLabel("opens an eye. Once it notices you, it begins to stand up and stares at you dead in the eyes,");
		JLabel last4 = new JLabel("roaring whilst spewing out flame in your general direction.");
		
		one = new JButton("Confront Dragon");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(last1);
		panel.add(last2);
		panel.add(last3);
		panel.add(last4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		lastCavern.add(lastPic);
		lastCavern.add(panel);
		lastCavern.add(panelButton);
		return lastCavern;
	}
	
	public JPanel firstIntermit()
	{
		JPanel panel = new JPanel();
		panel.setBackground(lightGrey);
		check = "firstIntermit";
		Handler handles = new Handler();
		window.stopMusic();
		window.music();
		
		image = new ImageIcon(getClass().getResource("cave.jpg"));
		
		JLabel lastPic = new JLabel(image);
		JLabel last1 = new JLabel("You make quick work of the whelp and begin to feel as if the encounter has made you more");
		JLabel last2 = new JLabel("powerful and sturdy. You learn a new ability, \"Shattering Blow\". When used, you deal");
		JLabel last3 = new JLabel("three times your normal weapon damage; however, it may only be used once every three turns.");
		JLabel last4 = new JLabel("You continue down the path and encounter a massive apparition. It stares you in the eyes and laughs.");
		
		one = new JButton("Begin Battle!");
		one.addActionListener(handles);
		
		Box panels = Box.createVerticalBox();
		panel.add(last1);
		panel.add(last2);
		panel.add(last3);
		panel.add(last4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		panel.add(lastPic);
		panel.add(panels);
		panel.add(panelButton);
		return panel;
	}
	
	public JPanel battleTwo()
	{
		JPanel battle = new JPanel();
		battle.setBackground(lightGrey);
		check = "battleTwo";
		Handler3 handles = new Handler3();
		window.stopMusic();														
		window.battleMusic();
		
		image = new ImageIcon(getClass().getResource("specter.jpg"));
		
		one = new JButton("Attack!");
		one.addActionListener(handles);
		
		two = new JButton("Defend!");
		two.addActionListener(handles);
		
		three = new JButton("View Combat Details");
		three.addActionListener(handles);
		
		four = new JButton("Shattering Blow");
		four.addActionListener(handles);
		
		five = new JButton("Victory!");
		five.addActionListener(handles);
		five.setVisible(false);
		
		JLabel whelp = new JLabel(image);
		
		statusText = new JLabel("You have encountered a wild Specter!");
		statusText2 = new JLabel("The Specter stares into your eyes...");
		
		playerHP = new JLabel("Player Health: 150");
		enemyHP = new JLabel("Specter Health: 125");
		
		Box panel = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panel.add(playerHP);
		panel.add(Box.createRigidArea(new Dimension(100, 100)));
		panel.add(enemyHP);
		
		Box panelButton = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panelButton.add(one);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(four);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(two);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(three);
		panelButton.add(five);
		
		Box statusPanel = Box.createVerticalBox();
		statusPanel.add(Box.createRigidArea(new Dimension(150, 50)));
		statusPanel.add(statusText);
		statusPanel.add(statusText2);
		
		battle.add(whelp);
		battle.add(panel);
		battle.add(panelButton);
		battle.add(statusPanel);
		return battle;
	}
	
	public JPanel secondIntermit()
	{
		JPanel panel = new JPanel();
		panel.setBackground(lightGrey);
		check = "secondIntermit";
		Handler handles = new Handler();
		window.stopMusic();
		window.music();
		
		image = new ImageIcon(getClass().getResource("cave.jpg"));
		
		JLabel lastPic = new JLabel(image);
		JLabel last1 = new JLabel("You sink your sword into the slimy ectoplasm of the specter and hear it wail out.");
		JLabel last2 = new JLabel("You tirelessly pull out your sword and wander ahead. You feel the Gods bless you with");
		JLabel last3 = new JLabel("their might. You feel stronger and seem to feel more sturdy. You have learned the ability \"Heal\".");
		JLabel last4 = new JLabel("When activated, you restore 25 percent of your total health; this ability has a 10 turn cooldown.");
		JLabel last5 = new JLabel("You also learn \"Guardian of the Light\". This can only be used once a battle; however, when activated,");
		JLabel last6 = new JLabel("it restores you to full health and makes your next two attacks deal double damage.");
		
		one = new JButton("Carry On!");
		one.addActionListener(handles);
		
		Box panels = Box.createVerticalBox();
		panel.add(last1);
		panel.add(last2);
		panel.add(last3);
		panel.add(last4);
		panel.add(last5);
		panel.add(last6);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		panel.add(lastPic);
		panel.add(panels);
		panel.add(panelButton);
		return panel;
	}
	
	public JPanel dead()
	{
		JPanel panel = new JPanel();
		panel.setBackground(lightGrey);
		check = "dead";
		sizeCheck = 2;
		Handler handles = new Handler();
		window.stopMusic();
		
		JLabel last1 = new JLabel("You have died...");
		last1.setFont(new Font("Serif", Font.PLAIN, 50));
		JLabel last2 = new JLabel("The journey of " + name + " ends here. Although " + name + " valiantly fought until the end,");
		JLabel last3 = new JLabel("the forces of " + Lair.getDragonName() + " were too overwhelming. May the Templar's Verdict find");
		JLabel last4 = new JLabel("a solution, and may justice be wrought upon the evildoers who threaten all...");
		
		one = new JButton("End Game");
		one.addActionListener(handles);
		
		Box panels = Box.createVerticalBox();
		panel.add(last1);
		panel.add(last2);
		panel.add(last3);
		panel.add(last4);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(150, 100)));
		panelButton.add(one);
		
		panel.add(panels);
		panel.add(panelButton);
		return panel;
	}
	
	public JPanel intermittent()
	{
		JPanel intermittent = new JPanel();
		intermittent.setBackground(lightGrey);
		check = "intermittent";
		ShatteringBlowCD = 0;
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("dragon2.jpg"));
		
		JLabel interPic = new JLabel(image);
		JLabel inter1 = new JLabel("\"Greetings knight. I suppose you are here to supposedly end my life; am I correct?\"");
		JLabel inter2 = new JLabel("The dragon stands in place as he speaks to you, and you begin to feel your heart race.");
		JLabel inter3 = new JLabel("Out of all the adventures you have been on, you have never dealt with such a massive");
		JLabel inter4 = new JLabel("beast, let alone a dragon, head on, in its domain, by yourself. The dragon seems to sense");
		JLabel inter5 = new JLabel("this and states, \"No need to respond, I felt that was the case. In any case, let me introduce");
		JLabel inter6 = new JLabel("myself. My name is " + Lair.getDragonName() + "; And I have heard of you before. You are that");
		JLabel inter7 = new JLabel("knight " + name + ", right? Anyway, I am feeling much too tired. Let us end this quickly.\"");
		JLabel inter8 = new JLabel("You raise your sword and shield once more, lose all fear, and stare the dragon straight in its");
		JLabel inter9 = new JLabel("eyes. You let out a battle cry and take a battle stance.");
		
		one = new JButton("Begin Battle!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(inter1);
		panel.add(inter2);
		panel.add(inter3);
		panel.add(inter4);
		panel.add(inter5);
		panel.add(inter6);
		panel.add(inter7);
		panel.add(inter8);
		panel.add(inter9);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		intermittent.add(interPic);
		intermittent.add(panel);
		intermittent.add(panelButton);
		return intermittent;
	}
	
	public JPanel lastBattle() 
	{
		JPanel battle = new JPanel();
		battle.setBackground(lightGrey);
		check = "lastBattle";
		Handler3 handles = new Handler3();
		sizeCheck = 1;
		window.stopMusic();																									
		window.finalMusic();
		
		image = new ImageIcon(getClass().getResource("dragon3.jpg"));
		
		one = new JButton("Attack!");
		one.addActionListener(handles);
		
		two = new JButton("Defend!");
		two.addActionListener(handles);
		
		three = new JButton("View Combat Details");
		three.addActionListener(handles);
		
		four = new JButton("Shattering Blow");
		four.addActionListener(handles);
		
		five = new JButton("Victory!");
		five.addActionListener(handles);
		five.setVisible(false);
		
		seven = new JButton("Guardian of the Light");
		seven.addActionListener(handles);
		
		JLabel whelp = new JLabel(image);
		
		statusText = new JLabel("You face " + Lair.getDragonName() + "!");
		statusText2 = new JLabel(Lair.getDragonName() + " prepares an incindiary blast.");
		
		playerHP = new JLabel("Player Health: 1000");
		enemyHP = new JLabel(Lair.getDragonName() + " Health: 10000");
		
		Box panel = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panel.add(playerHP);
		panel.add(Box.createRigidArea(new Dimension(100, 100)));
		panel.add(enemyHP);
		
		Box panelButton = Box.createHorizontalBox();
		panel.add(Box.createRigidArea(new Dimension(90, 0)));
		panelButton.add(one);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(four);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(two);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(three);
		panelButton.add(five);
		panelButton.add(Box.createRigidArea(new Dimension(50, 50)));
		panelButton.add(seven);
		
		Box statusPanel = Box.createVerticalBox();
		statusPanel.add(Box.createRigidArea(new Dimension(150, 50)));
		statusPanel.add(statusText);
		statusPanel.add(statusText2);
		
		battle.add(whelp);
		battle.add(panel);
		battle.add(panelButton);
		battle.add(statusPanel);
		return battle;
	}
	
	public JPanel dragonBattle()
	{
		JPanel dragonBattle = new JPanel();
		dragonBattle.setBackground(lightGrey);
		check = "dragonBattle";
		sizeCheck = 2;
		dragonSlain = true;
		Handler handles = new Handler();
		window.stopMusic();
		window.music();
		
		
		image=  new ImageIcon(getClass().getResource("dragonHead.jpg"));
		
		JLabel dragonPic = new JLabel(image);
		JLabel dragon1 = new JLabel("You lay a final blow and kill the dragon. After a long and epic struggle, you");
		JLabel dragon2 = new JLabel("cut off the dragon's head. Alas, you feel as if a heavy weight has been lifted");
		JLabel dragon3 = new JLabel("off your shoulders. You slowly walk out of the cave and tread back to " + Town.getTownName() + ".");
		
		one = new JButton("Victory!");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(dragon1);
		panel.add(dragon2);
		panel.add(dragon3);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(125, 25)));
		panelButton.add(one);
		
		dragonBattle.add(dragonPic);
		dragonBattle.add(panel);
		dragonBattle.add(panelButton);
		return dragonBattle;
	}
	
	public JPanel returnTown()
	{
		JPanel returnTown = new JPanel();
		check = "returnTown";
		returnTown.setBackground(lightGrey);
		Handler handles = new Handler();
		
		image = new ImageIcon(getClass().getResource("king.jpg"));
		
		JLabel returnPic = new JLabel(image);
		JLabel return1 = new JLabel("You come back to the town slowly, taking a week to come back. However, once you come");
		JLabel return2 = new JLabel("to the gates, the guards look down and notice the head you are carrying. They begin");
		JLabel return3 = new JLabel("to cheer as they open the gate. You walk in and notice people around you, cheering. You");
		JLabel return4 = new JLabel("walk towards the Templar's Verdict sanction, and head into the back where you meet the elder.");
		JLabel return5 = new JLabel("He smiles and says, \"You did well " + name + ". " + Town.getTownName() + " will never forget this act.\"");
		JLabel return6 = new JLabel("He continues, \"As for your reward... I will give you a weapon that has been passed");
		JLabel return7 = new JLabel("down my family for generations. It holds immense power, and I feel that it would best");
		JLabel return8 = new JLabel("be held in your hands. I bestow upon you " + Lair.getReward() + "!\"");
		JLabel return9 = new JLabel("You take the legendary weapon and hold it high in the air. You realize that there is");
		JLabel return10 = new JLabel("a crowd of knights around you hailing your name. Alas, the legend continues.");
		
		one = new JButton("End Game");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(return1);
		panel.add(return2);
		panel.add(return3);
		panel.add(return4);
		panel.add(return5);
		panel.add(return6);
		panel.add(return7);
		panel.add(return8);
		panel.add(return9);
		panel.add(return10);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		returnTown.add(returnPic);
		returnTown.add(panel);
		returnTown.add(panelButton);
		return returnTown;
	}
	
	public JPanel credits()
	{
		JPanel credits = new JPanel();
		credits.setBackground(lightGrey);
		check = "credits";
		Handler handles = new Handler();
		window.stopMusic();
		window.creditsMusic();
		
		image = new ImageIcon(getClass().getResource("logo.jpg"));
		
		JLabel creditsTitle = new JLabel(image);
		JLabel creditsSpace = new JLabel("");
		JLabel credits1 = new JLabel("Thanks for playing!");
		JLabel credits2 = new JLabel("Design and Development - Joseph Torres");
		JLabel credits3 = new JLabel("Music - Various Sources and Artists");
		JLabel credits4 = new JLabel("Images - Google Images");
		JLabel credits5 = new JLabel("Special thanks to those who tested it, and Mr. Schultz for inspiring it!");
		JLabel credits6 = new JLabel("Also, special thanks to Marco for helping out with the panel transitions!");
		JLabel credits7 = new JLabel("More content and updates coming in the near future!");
		
		creditsTitle.setFont(new Font("Serif", Font.PLAIN, 100));
		credits1.setFont(new Font("Serif", Font.PLAIN, 20));
		credits2.setFont(new Font("Serif", Font.PLAIN, 20));
		credits3.setFont(new Font("Serif", Font.PLAIN, 20));
		credits4.setFont(new Font("Serif", Font.PLAIN, 20));
		credits5.setFont(new Font("Serif", Font.PLAIN, 20));
		credits6.setFont(new Font("Serif", Font.PLAIN, 20));
		credits7.setFont(new Font("Serif", Font.PLAIN, 20));
		
		one = new JButton("Exit");
		one.addActionListener(handles);
		
		Box panel = Box.createVerticalBox();
		panel.add(creditsTitle);
		panel.add(Box.createRigidArea(new Dimension(0, 50)));
		panel.add(credits1);
		panel.add(creditsSpace);
		panel.add(credits2);
		panel.add(creditsSpace);
		panel.add(credits3);
		panel.add(creditsSpace);
		panel.add(credits4);
		panel.add(creditsSpace);
		panel.add(credits5);
		panel.add(creditsSpace);
		panel.add(credits6);
		panel.add(creditsSpace);
		panel.add(credits7);
		
		Box panelButton = Box.createVerticalBox();
		panelButton.add(Box.createRigidArea(new Dimension(100, 25)));
		panelButton.add(one);
		
		credits.add(panel);
		credits.add(panelButton);
		return credits;
	}
	
	public Window getWindow()
	{
		return window;
	}
	
	//Handler functions for the transition between panes
	private class Handler implements ActionListener, KeyListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//First Button
			if(event.getSource() == one)
			{
				if(check.equals("prologue"))
				{
					window.setPanel(start());
				}
				else if(check.equals("intro1"))
				{
					window.setPanel(intro2());
				}
				else if(check.equals("intro2"))
				{
					window.setPanel(town1());
				}
				else if("main".equals(check))
				{
					window.setPanel(prologue());
				}
				else if(check.equals("patchNotes"))
				{
					window.setPanel(main());
				}
				else if(check.equals("town1"))
				{
					if(dragonSlain)
					{}
					else
					{
						window.setPanel(elderNotComplete());
					}
				}
				else if(check.equals("elderNotComplete"))
				{
					window.setPanel(town1());
				}
				else if(check.equals("notShop"))
				{
					window.setPanel(town1());
				}
				else if(check.equals("shop"))
				{
					window.setPanel(shop2());
				}
				else if(check.equals("shopRight"))
				{
					window.setPanel(town1());
				}
				else if(check.equals("shopDone"))
				{
					window.setPanel(town1());
				}
				else if(check.equals("shopWrong"))
				{
					window.setPanel(shop2());
				}
				else if(check.equals("shopComplete"))
				{
					window.setPanel(cavern());
				}
				else if(check.equals("cavern"))
				{
					window.setPanel(innerCavern());
				}
				else if(check.equals("innerCavern"))
				{
					window.setPanel(innerBattle());
					if(hasDoneCombat){}
					else
					{
						hasDoneCombat = true;
						JOptionPane.showMessageDialog(null, "Hello! As this is your first time engaging in the combat system, a quick tutorial will be given.", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "First off, the player's health and enemy's health are shown beneath the portrait of the enemy.", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Next, the buttons shown give commands which the player can perform on his or her turn.\n" +
								"The commands are fairly straightforward, however as new abilities are acquired, their function can bee soon on the\n" +
								"\"View Combat Details\" button.", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "If the player dies before the enemy, then the game is over for the player. If the opponent\n" +
								"dies before the player, the player progresses. However, on the event that a turn would result in the death of both the\n" +
								"opponent and the player, the game ends and the player loses, as mutual death is not a victory.", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "That is all for the battles - Good luck and have fun!", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else if(check.equals("lastCavern"))
				{
					window.setPanel(intermittent());
				}
				else if(check.equals("intermittent"))
				{
					window.setPanel(lastBattle());
				}
				else if(check.equals("dragonBattle"))
				{
					window.setPanel(returnTown());
				}
				else if(check.equals("returnTown"))
				{
					window.setPanel(credits());
				}
				else if(check.equals("firstIntermit"))
				{
					window.setPanel(battleTwo());
				}
				else if(check.equals("credits"))
				{
					System.exit(0);
				}
				else if(check.equals("secondIntermit"))
				{
					window.setPanel(lastCavern());
				}
				else if(check.equals("dead"))
				{
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Unknown command. Please infom host if possible.", "Knight Quest", JOptionPane.ERROR_MESSAGE);
				}
			}
			//2nd button
			else if(event.getSource() == two)
			{
				if(check.equals("main"))
				{
					window.setPanel(patchNotes());
				}
				else if(check.equals("town1"))
				{
					if(hasGoneToShop)
					{
						window.setPanel(shopDone());
					}
					else
					{
						window.setPanel(shop());
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Unknown command. Please infom host if possible.", "Knight Quest", JOptionPane.ERROR_MESSAGE);
				}
			}
			//Third Button
			else if(event.getSource() == three)
			{
				if(check.equals("main"))
				{
					System.exit(0);
				}
				else if(check.equals("town1"))
				{
					JOptionPane.showMessageDialog(null, "Gather your gear and venture to the Caverns of Shadows.", "Quest Log", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Unknown command. Please infom host if possible.", "Knight Quest", JOptionPane.ERROR_MESSAGE);
				}
			}
			//Fourth Button
			else if(event.getSource() == four)
			{
				if(check.equals("main"))
				{
					
				}
				else if(check.equals("town1"))
				{
					if(hasGoneToShop)
					{
						window.setPanel(shopComplete());
					}
					else
					{
						window.setPanel(notShop());
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ERROR! Unknown command. Please infom host if possible.", "Knight Quest", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
			
		}

		@Override
		public void keyReleased(KeyEvent e)
		{
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				JTextField field = (JTextField) e.getSource();
				name = field.getText();
				window.setPanel(intro1());
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
	}
	
	//Handler2 functions for the shop's NumberGame
	private class Handler2 implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				JTextField field = (JTextField) e.getSource();
				numberGameString = field.getText();
				numberGameInt = Integer.parseInt(numberGameString);
				
				if(numberGameInt == numberGameRandomInt)
				{
					window.setPanel(shopRight());
				}
				else
				{
					window.setPanel(shopWrong());
				}
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//Handler3 functions for the battle action listener
	private class Handler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//First Battle
			if(check.equals("innerBattle"))
			{
				if(e.getSource() == one)
				{
					Random rand = new Random();
					
					int whelpDamage = rand.nextInt(5) + 3;
					int playerDamage = rand.nextInt(5) + 4;
					
					whelpHP -= playerDamage;
					whelpHPString = String.valueOf("Whelp Health: " + whelpHP);
					enemyHP.setText(whelpHPString);
					if (whelpHP <= 0)
					{
						statusText.setText("You have defeated the Emerald Whelpling!");
						enemyHP.setText("Whelp Health: Dead");
						five.setVisible(true);
						one.setVisible(false);
						two.setVisible(false);
						three.setVisible(false);
					}
					playerHPint -= whelpDamage;
					playerHPString = String.valueOf("Player Health: " + playerHPint);
					playerHP.setText(playerHPString);
					if (playerHPint <= 0)
					{
						window.setPanel(dead());
					}
					String combatLog = String.format("You have dealt %d damage to the whelp and the whelp has dealt %d damage to you.", playerDamage, whelpDamage);
					statusText.setText(combatLog);
				}
				else if(e.getSource() == two)
				{
				
					Random rand = new Random();
					
					int whelpDamage = rand.nextInt(5) + 3;
					int playerDamage = rand.nextInt(4) + 2;
					int check = rand.nextInt(2) + 1;
					
					if(check == 1)
					{
						whelpHP -= playerDamage;
						whelpHPString = String.valueOf("Whelp Health: " + whelpHP);
						enemyHP.setText(whelpHPString);
						if (whelpHP <= 0)
						{
							statusText.setText("You have defeated the Emerald Whelpling!");
							enemyHP.setText("Whelp Health: Dead");
							five.setVisible(true);
							one.setVisible(false);
							two.setVisible(false);
							three.setVisible(false);
							four.setVisible(false);
						}
						String combatLog = String.format("You have dealt %d damage to the whelp and you took no damage!", playerDamage);
						statusText.setText(combatLog);
					}
					else
					{
						playerHPint -= whelpDamage;
						playerHPString = String.valueOf("Player Health: " + playerHPint);
						playerHP.setText(playerHPString);
						if (playerHPint2 <= 0)
						{
							window.setPanel(dead());
						}
						String combatLog = String.format("You have dealt no damage to the whelp and the whelp has dealt %d damage to you.", whelpDamage);
						statusText.setText(combatLog);
					}
				}
				else if(e.getSource() == three)
				{
					JOptionPane.showMessageDialog(null, "Attack! Damage Base: 3 - 7\n" +
							"Defend! Damage Base: 2 - 5 plus no damage this turn (50% failure)\n" +
							"Emerald Whelpling Damage Base 4 - 8", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(e.getSource() == four)
				{
					
				}
				else if(e.getSource() == five)
				{
					if(check.equals("innerBattle"))
					{
					window.setPanel(firstIntermit());
					}
				}
			}
			//2nd Battle
			else if(check.equals("battleTwo"))
			{
				if(e.getSource() == one)
				{
					Random rand = new Random();
					
					int specterDamage;
					
					if(wraithCurseCD == 0)
					{
						specterDamage = 20;
						wraithCurseCD = 3;
					}
					else
					{
						specterDamage = rand.nextInt(6) + 5;
						wraithCurseCD--;
					}
					
					int playerDamage = rand.nextInt(8) + 7;
						
					specterHP -= playerDamage;
					specterHPString = String.valueOf("Specter Health: " + specterHP);
					enemyHP.setText(specterHPString);
					if (specterHP <= 0)
					{
						statusText.setText("You have defeated the Specter!");
						statusText2.setText("You may now continue...");
						enemyHP.setText("Specter Health: Dead");
						five.setVisible(true);
						one.setVisible(false);
						two.setVisible(false);
						three.setVisible(false);
						four.setVisible(false);
						ShatteringBlowCD = 0;
					}
					playerHPint2 -= specterDamage;
					playerHPString = String.valueOf("Player Health: " + playerHPint2);
					playerHP.setText(playerHPString);
					if (playerHPint2 <= 0)
					{
						window.setPanel(dead());
					}
					String combatLog1 = String.format("You have dealt %d damage to the specter.", playerDamage);
					statusText.setText(combatLog1);
					String combatLog2 = String.format("The specter has dealt %d damage to you.", specterDamage);
					statusText2.setText(combatLog2);
					if(ShatteringBlowCD != 0)
						ShatteringBlowCD--;
				}
				else if(e.getSource() == two)
				{
					Random rand = new Random();
					
					int specterDamage;
					
					if(wraithCurseCD == 0)
					{
						specterDamage = 20;
						wraithCurseCD = 3;
					}
					else
					{
						specterDamage = rand.nextInt(6) + 5;
						wraithCurseCD--;
					}
					
					int playerDamage = rand.nextInt(5) + 5;
					int check = rand.nextInt(2) + 1;
					
					if(check == 1)
					{
						specterHP -= playerDamage;
						specterHPString = String.valueOf("Specter Health: " + specterHP);
						enemyHP.setText(specterHPString);
						if (whelpHP <= 0)
						{
							statusText.setText("You have defeated the Specter!");
							statusText2.setText("You may now continue...");
							enemyHP.setText("Specter Health: Dead");
							five.setVisible(true);
							one.setVisible(false);
							two.setVisible(false);
							three.setVisible(false);
							four.setVisible(false);
							ShatteringBlowCD = 0;
						}
						String combatLog1 = String.format("You have dealt %d damage to the specter!", playerDamage);
						statusText.setText(combatLog1);
						String combatLog2 = String.format("The specter dealt no damage to you.");
						statusText2.setText(combatLog2);
						if(ShatteringBlowCD != 0)
							ShatteringBlowCD--;
					}
					else
					{
						playerHPint2 -= specterDamage;
						playerHPString = String.valueOf("Player Health: " + playerHPint2);
						playerHP.setText(playerHPString);
						if (playerHPint2 <= 0)
						{
							window.setPanel(dead());
						}
						String combatLog1 = String.format("You have dealt no damage to the specter.");
						statusText.setText(combatLog1);
						String combatLog2 = String.format("The specter dealt %s damage to you!", specterDamage);
						statusText2.setText(combatLog2);
						if(ShatteringBlowCD != 0)
							ShatteringBlowCD--;
					}		
				}
				else if(e.getSource() == three)
				{
					JOptionPane.showMessageDialog(null, "Attack! Damage Base: 7 - 14\n" +
							"Defend! Damage Base: 5 - 9 plus no damage this turn (50% failure)\n" +
							"Shattering Blow Base:  21 - 42 (Three Turn CD)\n" +
							"Specter Damage Base: 5 - 10\n" +
							"Specter Curse Damage: 20", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(e.getSource() == four)
				{
					if(ShatteringBlowCD == 0)
					{
						Random rand = new Random();
						
						int specterDamage;
						
						if(wraithCurseCD == 0)
						{
							specterDamage = 20;
							wraithCurseCD = 3;
						}
						else
						{
							specterDamage = rand.nextInt(6) + 5;
							wraithCurseCD--;
						}
						
						int playerDamage = rand.nextInt(22) + 21;
							
						specterHP -= playerDamage;
						specterHPString = String.valueOf("Specter Health: " + specterHP);
						enemyHP.setText(specterHPString);
						if (specterHP <= 0)
						{
							statusText.setText("You have defeated the Specter!");
							statusText2.setText("You may now continue...");
							enemyHP.setText("Specter Health: Dead");
							five.setVisible(true);
							one.setVisible(false);
							two.setVisible(false);
							three.setVisible(false);
							four.setVisible(false);
							ShatteringBlowCD = 0;
						}
						playerHPint2 -= specterDamage;
						playerHPString = String.valueOf("Player Health: " + playerHPint2);
						playerHP.setText(playerHPString);
						if (playerHPint2 <= 0)
						{
							window.setPanel(dead());
						}
						String combatLog1 = String.format("You swing your sword with holy might and deal %s damage to the specter.", playerDamage);
						statusText.setText(combatLog1);
						String combatLog2 = String.format("The specter has dealt %d damage to you.", specterDamage);
						statusText2.setText(combatLog2);
						ShatteringBlowCD = 3;
					}
					else
					{
						statusText.setText("That ability is on cooldown and cannot be used this turn.");
						if(ShatteringBlowCD > 1)
						{
							statusText2.setText("You may use this again in " + ShatteringBlowCD + " turns.");
						}
						else
						{
							statusText2.setText("You may use this again in " + ShatteringBlowCD + " turn.");
						}
					}
				}
				else if(e.getSource() == five)
				{
						window.setPanel(secondIntermit());	
				}
					
				}
		
			//Third Battle
			else if (check.equals("lastBattle"))
			{
				
				if(e.getSource() == one)
				{
					Random rand = new Random();
					
					int dragonDamage;
					int playerDamage;
					
					if(dragonBreathCD == 0)
					{
						dragonDamage = 75;
						dragonBreathCD = 3;
					}
					else
					{
						dragonDamage = rand.nextInt(11) + 25;
						dragonBreathCD--;
					}
					
					if(modifier > 0)
					{
						playerDamage = 2 * (rand.nextInt(76) + 125);
						modifier--;
					}
					else
					{
						playerDamage = rand.nextInt(76) + 125;
					}
					
					dragonHP -= playerDamage;
					dragonHPString = String.valueOf(Lair.getDragonName() + " Health: " + dragonHP);
					enemyHP.setText(dragonHPString);
					if (dragonHP <= 0)
					{
						statusText.setText("You have slain " + Lair.getDragonName() + "!");
						statusText2.setText(Town.getQuestName() + " has been successfully killed!");
						enemyHP.setText(Lair.getDragonName() + ": Dead");
						five.setVisible(true);
						one.setVisible(false);
						two.setVisible(false);
						three.setVisible(false);
						four.setVisible(false);
						seven.setVisible(false);
						ShatteringBlowCD = 0;
						healCD = 0;
						GuardianCD = 0;
					}
					playerHPint3 -= dragonDamage;
					playerHPString = String.valueOf("Player Health: " + playerHPint3);
					playerHP.setText(playerHPString);
					if (playerHPint3 <= 0)
					{
						window.setPanel(dead());
					}
					String combatLog1 = String.format("You have dealt %d damage to " + Lair.getDragonName() + ".", playerDamage);
					statusText.setText(combatLog1);
					String combatLog2 = String.format(Lair.getDragonName() + " has dealt %d damage to you.", dragonDamage);
					statusText2.setText(combatLog2);
					if(ShatteringBlowCD != 0)
						ShatteringBlowCD--;
					if(healCD != 0)
						healCD--;
				}
				else if(e.getSource() == two)
				{
					Random rand = new Random();
					
					int dragonDamage;
					int playerDamage;
					
					if(dragonBreathCD == 0)
					{
						dragonDamage = 75;
						dragonBreathCD = 3;
					}
					else
					{
						dragonDamage = rand.nextInt(11) + 25;
						dragonBreathCD--;
					}
					
					if(modifier > 0)
					{
						playerDamage = 2 * (rand.nextInt(21) + 75);
						modifier--;
					}
					else
					{
						playerDamage = rand.nextInt(21) + 75;
					}
					
					int check = rand.nextInt(2) + 1;
					
					if(check == 1)
					{
						dragonHP -= playerDamage;
						dragonHPString = String.valueOf(Lair.getDragonName() + " Health: " + dragonHP);
						enemyHP.setText(dragonHPString);
						if (dragonHP <= 0)
						{
							statusText.setText("You have slain " + Lair.getDragonName() + "!");
							statusText2.setText(Town.getQuestName() + " has been successfully killed!");
							enemyHP.setText(Lair.getDragonName() + ": Dead");
							five.setVisible(true);
							one.setVisible(false);
							two.setVisible(false);
							three.setVisible(false);
							four.setVisible(false);
							seven.setVisible(false);
							ShatteringBlowCD = 0;
							healCD = 0;
							GuardianCD = 0;
						}
						String combatLog1 = String.format("You have dealt %d damage to " + Lair.getDragonName() + ".", playerDamage);
						statusText.setText(combatLog1);
						String combatLog2 = String.format(Lair.getDragonName() + "has dealt no damage to you!");
						statusText2.setText(combatLog2);
						if(ShatteringBlowCD != 0)
							ShatteringBlowCD--;
						if(healCD != 0)
							healCD--;
					}
					else
					{
						playerHPint3 -= dragonDamage;
						playerHPString = String.valueOf("Player Health: " + playerHPint3);
						playerHP.setText(playerHPString);
						if (playerHPint3 <= 0)
						{
							window.setPanel(dead());
						}
						String combatLog1 = String.format("You have dealt no damage to " + Lair.getDragonName() + ".");
						statusText.setText(combatLog1);
						String combatLog2 = String.format(Lair.getDragonName() + " dealt %s damage to you!", dragonDamage);
						statusText2.setText(combatLog2);
						if(ShatteringBlowCD != 0)
							ShatteringBlowCD--;
						if(healCD != 0)
							healCD--;
					}		
				}
				else if(e.getSource() == three)
				{
					JOptionPane.showMessageDialog(null, "Attack! Damage Base: 125 - 200\n" +
							"Defend! Damage Base: 75 - 95 plus no damage this turn (50% failure)\n" +
							"Shattering Blow Base:  375 - 600 (Three Turn CD)\n" +
							"Heal Base: 250 Health (Ten Turn CD, Opponent Still Deals Damage, Cannot Heal Past Max HP)\n" +
							"Guardian of the Light: Restore to Full Health and Double Damage for Two Turns (ONCE PER ENCOUNTER)\n" +
							"Dragon Damage Base: 25 - 35\n" +
							"Flame Breath Base: 50", "Knight Quest", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(e.getSource() == four)
				{
					if(ShatteringBlowCD == 0)
					{
						Random rand = new Random();
						
						int dragonDamage;
						int playerDamage;
						
						if(dragonBreathCD == 0)
						{
							dragonDamage = 75;
							dragonBreathCD = 3;
						}
						else
						{
							dragonDamage = rand.nextInt(11) + 25;
							dragonBreathCD--;
						}
						
						if(modifier > 0)
						{
							playerDamage = 2 * (rand.nextInt(226) + 375);
							modifier--;
						}
						else
						{
							playerDamage = rand.nextInt(226) + 375;
						}
							
						dragonHP -= playerDamage;
						dragonHPString = String.valueOf(Lair.getDragonName() + " Health: " + dragonHP);
						enemyHP.setText(dragonHPString);
						if (dragonHP <= 0)
						{
							statusText.setText("You have slain " + Lair.getDragonName() + "!");
							statusText2.setText(Town.getQuestName() + " has been successfully killed!");
							enemyHP.setText(Lair.getDragonName() + ": Dead");
							five.setVisible(true);
							one.setVisible(false);
							two.setVisible(false);
							three.setVisible(false);
							four.setVisible(false);
							seven.setVisible(false);
							ShatteringBlowCD = 0;
							healCD = 0;
							GuardianCD = 0;
						}
						playerHPint3 -= dragonDamage;
						playerHPString = String.valueOf("Player Health: " + playerHPint3);
						playerHP.setText(playerHPString);
						if (playerHPint3 <= 0)
						{
							window.setPanel(dead());
						}
						String combatLog1 = String.format("You swing your sword with holy might and deal %s damage to " + Lair.getDragonName() + ".", playerDamage);
						statusText.setText(combatLog1);
						String combatLog2 = String.format(Lair.getDragonName() + " has dealt %d damage to you.", dragonDamage);
						statusText2.setText(combatLog2);
						ShatteringBlowCD = 3;
						if(healCD != 0)
							healCD--;
					}
					else
					{
						statusText.setText("That ability is on cooldown and cannot be used this turn.");
						if(ShatteringBlowCD > 1)
						{
							statusText2.setText("You may use this again in " + ShatteringBlowCD + " turns.");
						}
						else
						{
							statusText2.setText("You may use this again in " + ShatteringBlowCD + " turn.");
						}
					}
				}
				else if(e.getSource() == seven)
				{
					if(GuardianCD == 0)
					{
						playerHPint3 = 1000;
						modifier = 2;
						playerHPString = String.valueOf("Player Health: " + playerHPint3);
						playerHP.setText(playerHPString);
						dragonHPString = String.valueOf(Lair.getDragonName() + " Health: " + dragonHP);
						enemyHP.setText(dragonHPString);
						statusText.setText("You call upon the power of the heavens to give you strength.");
						statusText2.setText("You become rejuvenated and temporarily feel more powerful for your next 2 abilities that deal damage.");
						GuardianCD = 1;
					}
					else
					{
						statusText.setText("This ability has already been used this encounter and cannot be used again.");
						statusText2.setText(Lair.getDragonName() + " stares at you intently as you decide what your next move is.");
					}
				}
				if(e.getSource() == five)
				{
					window.setPanel(dragonBattle());
				}
			}
		}
	}
}
