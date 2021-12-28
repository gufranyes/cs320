package Model.Stories;

import Controller.StoryController;
import Model.*;

public class IllegalArena extends Story{
    private StoryController storyController;

    public IllegalArena(StoryController storyController) {
        this.storyController = storyController;

        String e1Str = "It was one of these days that you were used to. You looked out the window of an inn where you are staying. It was cloudy like the bartender guessed yesterday. You packed up your stuff to waste some time until night as usual. When you think about the work you do, it made more sense to keep your head blank when you are not working. Fighting to the hilt each week wasn't just physically tough. It also requires a solid mind. There are many things you can do. 3 days ago, you left your weapon at the blacksmith to be repaired. It's probably already over. But your cousin also wanted you to intimidate a few punks who were threatening him. Remember, family is everything. Finally, according to rumors you heard during your stay at the inn, the military garrison has been having problems lately. That's why things can get tense easily even in the smallest of crimes. Of course, the choice is yours. A gladiator must be determined to survive, right? What would you like to do first?";
        String e1o1Str = "Check the blacksmith";
        String e1o2Str = "Help your cousin";
        String e1o3Str = "Visit a friend at the garrison";
        String e1o4Str = "Just drink until night";
        Event event1 = new Event(e1Str, 1, 2, 3, 4, 5, storyController.player, new Actor(), e1o1Str, e1o2Str, e1o3Str, e1o4Str, false, false);

        String e2Str = "You know that the blacksmith's shop consists of two parts. Normally, regular customers don't want to come near the dust and hot furnace, so the blacksmith greets them in the front section. Cleaner area with stalls. But he spends most of the day working in the back. Where he forges weapons and makes heavy armor. They can't scare a warrior like you with some dust and heat, can they? You go straight to the back. The sweaty old dwarf was so focused on the armor in front of him that he didn't even see you. When you focus a little more on the armor he's forging, you realize that it's too big even for a big guy. Of course, at this time he sees you and says, “Oh, so you're here. I'm bringing your order right now.\" He walks away with small but powerful steps. Before long, you see that he has come with your weapon. Honestly, even the kid in the street can understand that the blacksmith is doing a solid job. This old man has been very nice to you since you helped him last year. Although he knew almost everyone in the city, the number of people with him suddenly decreased in his difficult time. You're not surprised, are you? That's life. After thanking the blacksmith and making the payment, you leave to take your weapon to your room. ";
        String e2AllOptions = "Go to your room.";
        Event event2 = new Event(e2Str, 2, 5, 5, 5, 5, storyController.player, new Item("Blacksmith's Masterpiece", "Weapon", 3, 0, "", 0), e2AllOptions, e2AllOptions, e2AllOptions, e2AllOptions, false, false);

        String e3Str = "Your cousin is a clerk in a bank. Unlike yours, she has a pretty regular life. You don't have to wait for your cousin to get off work, thanks to your sleep patterns that are the opposite of normal people. Because you're sleeping while she is at work. When you got to her house, you found the door open and there was a clicking sound from inside. When you enter with cautious steps, you see 3 punks. In a possible fight, they are not even rivals for you. They've smashed all over the house, you don't know what they're looking for, but your cousin isn't here. When you asked where your cousin was, the bigger one of them said, “Are you after the bills too? As long as that bitch doesn't give us the bills, we'll find her even if she escapes to hell. You don't want to get in our way!” and heads for the door to exit. Did these reckless punks just threaten your cousin? He even threatened you afterward. How is he still breathing after all he said? You feel the blood in your brain that makes you a gladiator. When you give the nearest punk a solid head and the next one to him attacks you, you twist his arm and get behind him. The big punk grabs the leg of the broken chair on the floor and rushes towards you, you are pushing the one that you are holding the arm towards him. When they both stumble, you land a few solid punches and knock them out. But what can stop you? They disrespected and threatened you and your cousin at her house. You take the chair leg from the punk’s hand and start slamming it in his face. As it breaks, you keep hitting it with whatever you can get your hands on from the ground. When there's blood everywhere and the man's face is flat, you see your cousin. “I'll take care of the rest,” she said, frightened. You head back to the inn, out of breath.";
        String e3AllOptions = "Go back to the inn.";
        Event event3 = new Event(e3Str, 3, 5, 5, 5, 5, storyController.player, new Actor(), e3AllOptions, e3AllOptions, e3AllOptions, e3AllOptions, false, false);

        String e4Str = "You always get nervous on your way to military lodging. Due to what is happening in the Arena, there may be problems all the time. You visit your friend Gerry, who helped you when you thought you messed up, from time to time and bring some snacks. Usually, you wouldn't have any trouble entering the lodging, but this time everyone seems more nervous and you are faced with a lot of questions at the entrance. Fortunately, the soldiers, who still retain some of their corruption, let you in for a small bribe. After casual conversations with Gerry, you ask why everyone is nervous. He's telling you about an unsolved murder case recently and the special investigative unit brought in from another city for this case. It seems that senior officials in the military are quite uncomfortable with the reputation struggle with this unit and insist on giving much heavier punishments than normal for every crime they encounter. He also advises you to be careful about fights in the arena. After chatting a little more about your old memories, you return to the inn without any more trouble.";
        String e4AllOptions = "Return to the inn.";
        Event event4 = new Event(e4Str, 4, 5, 5, 5, 5, storyController.player, new Actor(), e4AllOptions, e4AllOptions, e4AllOptions, e4AllOptions, false, false);

        String e5Str = "The bartender had a nervous expression on his face when you returned to the inn. He often stared at the man sitting in the back. You went to your room to wash your hands and leave your things. However, you noticed a heavy pouch in the middle of the room. When you opened it, it was full of gold with a small note. “Find the lightning.” The bartender called out to you as you left the room to find out what had happened. \"Hey! That strange man left you a note.” When you approached and looked at the note, it was written “Saint Lightning”. The bartender's eyes were still on you. You turned to him and said:";
        String e5o1 = "“There is nothing. It's a bad joke.”";
        String e5o2 = "“He is talking about Saint lightning.”";
        String e5o3 = "“Thank you. Can I have a drink?”";
        String e5o4 = "Continue to inspect the paper without saying anything.";
        Event event5 = new Event(e5Str, 5, 6, 6, 6, 6, storyController.player, new Actor(), e5o1, e5o2, e5o3, e5o4, false, false);

        String e6Str = "\"Sir, I ask you to pack your things and leave the inn.\" As he said this, he was pointing to the guard with one hand. You were already thinking of leaving soon since the match in the arena was approaching. You packed your things and hit the streets. You've seen the name Saint Lightning before while reading the bets in the arena. As far as you know, Saint Lightning arranges most of the mid-budget bets. You have a guess as to what he might want from you. He may ask you to do a match-fix. If he gave so much gold without even hearing your answer, it was worth talking about at least. Or maybe you can throw the gold he gave you in his face and refuse his offer. You entered the arena and turned to the teller, who takes the bets, to ask about St. Lightning. However, before you could reach, a man with lightning tattoos on his arm grabbed your arm and said, “Let me lead sir, please.” He started guiding you. After crossing several corridors and down the stairs, you entered a room. Saint Lightning was standing in front of you.";
        String e6AllOptions = "Next";
        Event event6 = new Event(e6Str, 6, 7, 7, 7, 7, storyController.player, new Actor(), e6AllOptions, e6AllOptions, e6AllOptions, e6AllOptions, false, false);

        String e7Str = "“I suppose you have some idea why I called you. I want you to fix and lose fov tonight's game. The odds ave pvetty good vight now, you'll win a pvetty decent amount of gold. Appavently, neithev you nov youv cousin will have to wovk anymove. What are you thinking?\" Yes, really what do you think? Fight with your dignity and get the victory you deserve? Or focus on gold and sell the match? Your answer:";
        String e7o1 = "Accept";
        String e7o2 = "Decline";
        Event event7 = new Event(e7Str, 7, 9, 9, 8, 8, storyController.player, new Actor(), e7o1, e7o1, e7o2, e7o2, false, false);

        String e8Str = "\"WHAT? DID CONQUEROR TERM BUY YOU?” he suddenly calms down and continues, “You don't want to reject us when you have a cousin you can lose. Be smart, don't be a paid dog!” He signals one of his men and they start beating you until getting accepted. As you continue to resist, they threaten to kill your cousin, and they finally hear you say \"I accept\", albeit forcefully.";
        String e8AllOptions = "You accept";
        Event event8 = new Event(e8Str, 8, 9, 9, 9, 9, storyController.player, new Actor(), e8AllOptions,e8AllOptions, e8AllOptions, e8AllOptions, false, false);

        String e9Str = "You see a big smile on Saint Lightning’s face. “Gveat boy, I knew you would agvee.” When you leave the room alone, you know that they will follow you until the end of the match. There is very little time left before the start of the fight. To get ready, you go to the room reserved for you in the Arena. You remember your first win, the day you stepped into the arena. What a great crowd and what an honor. When you step out, the crowd is no different, but there is no honor in this fight. You do what needs to be done and when the fight goes on long enough, you lose.";
        String e9AllOptions = "You know what to do.";
        Event event9 = new Event(e9Str, 9, 10, 10, 10, 10, storyController.player, new Actor(), e9AllOptions, e9AllOptions, e9AllOptions, e9AllOptions, false, false);

        String e10Str = "There's too much blood rushing into the veins to spill out. You lost this fight, but judging by the wounds on your opponent, it's not like he won either. At least you made the unhappy majority watch an enjoyable fight. I hope the soldiers waiting in your room because they are enjoyed the fight. Because apparently, they didn't come to congratulate you. As soon as they saw you, they laid you on the ground and tied your hands. You didn't even have a chance to resist the 3 soldiers who rushed on you. Even if they don't talk with you, you know where this will end. Your only hope is for Saint Lightning to give the money to your cousin. As the soldiers take you:";
        String e10o1 = "Resist";
        String e10o2 = "Try to talk to them";
        String e10o3 = "Go without difficulty";
        String e10o4 = "Start shouting";
        Event event10 = new Event(e10Str, 10, 11, 11, 11, 11, storyController.player, new Actor(), e10o1, e10o2, e10o3, e10o4, false, false);

        String e11Str = "You faint from a blow to the head before you even leave the Arena. You wake up for a few seconds in a very short time, and you remember hearing words like \"Red-handed\", \"Send directly\" in those moments. When you wake up, you realize that you are alone in a cell. There is something in front of you that even dogs will refuse to eat, but you seem like you are not in a position to choose food. You should be careful though because you know from past experience that Saint Lightning will do everything in his power to silence you. So, what are you going to do?";
        String e11o1 = "Eat the food";
        String e11o2 = "Sleep and rest";
        Event event11 = new Event(e11Str, 11, 12, 12, 13, 13, storyController.player, new Actor(), e11o1, e11o1, e11o2, e11o2, false, false);

        String e12Str = "Half an hour after eating, you feel a numbness in your head. Your eyelids are getting heavier and you're falling into a short sleep. When you open your eyes, you are no longer alone. You are faced with a person with a white beard, round-rimmed glasses, and a very smiling face. He must have understood your suspicious look because he approaches you and says, \"Don't worry, I'm not permanent here\", goes back a bit, and examines you and the surroundings. He takes your hands and raises them, then says, “But I hear you're here to stay.” As a matter of fact, all the actions of this old man are very suspicious. “Did they say why you're here? Or do you want to explain?\" He is staring at you, his eyes growing bigger behind the glasses. Your answer:";
        String e12o1 = "“I don't know why I'm here. I did nothing wrong.” (Lie)";
        String e12o2 = "“I match-fixed. I had to.”";
        Event event12 = new Event(e12Str, 12, 14, 14, 14, 14, storyController.player, new Actor(), e12o1, e12o1, e12o2, e12o2, false, false);

        String e13Str = "Considering the condition, you are in, you sleep relatively well. When you open your eyes, you are no longer alone. You are faced with a person with a white beard, round-rimmed glasses, and a very smiling face. He must have understood your suspicious look because he approaches you and says, \"Don't worry, I'm not permanent here\", goes back a bit, and examines you and the surroundings. He takes your hands and raises them, then says, “But I hear you're here to stay.” As a matter of fact, all the actions of this old man are very suspicious. “Did they say why you're here? Or do you want to explain?\" He is staring at you, his eyes growing bigger behind the glasses. Your answer:";
        Event event13 = new Event(e13Str, 13, 14, 14, 14, 14, storyController.player, new Actor(), e12o1, e12o1, e12o2, e12o2, false, false);

        String e14Str = "“I already know what you've done, dear. I just wanted to hear from you” he lowers his voice a little. After checking the surroundings, “Now listen to me carefully. Saint Lightning had your cousin killed and he wants you to face the same end. I can get you out of here if you want. But I could also be lying by provoking you to kill Saint Lightning. You will never know the truth in this cell. Or maybe they'll release you soon anyway. You sold your honor once, maybe now you want to live with it. What are you saying?\" What the heck is this guy? Could they really have killed my cousin? But what if I'm caught running away? Why should I trust this old man? Your answer:";
        String e14o1 = "Attack the Old Man";
        String e14o2 = "Expect to be forgiven with dignity";
        String e14o3 = "Try to escape";
        String e14o4 = "Go berserk";
        Event event14 = new Event(e14Str, 14, 15, 16, 17, 15, storyController.player, new Actor(), e14o1, e14o2, e14o3, e14o4, false, false);

        String e15Str = "You jumped on the old man and started throwing punches. The last time you remember, you were banging his head on the floor over and over. But when you regained consciousness, you realized that the person you beat was not an old man, but a soldier on duty. You seem to be surrounded by a few more soldiers and have no way out. The person you think is more authoritative will be bored with all this, so he says \"Get it done\" and leaves. Although soldiers approach cautiously, they swoop down on you and tie you up. You are going out. The sun is about to rise, albeit slightly windy. You stopped by a tree. They pulled the rope. There is no one around. They tied a knot in the rope on one of the tree's seemingly intact branches. You can even feel the heartbeat in your ears. No matter how hard you resist, they pick you up and put the rope around your neck. After the soldiers let you go, you no longer feel anything in your ears.";
        Event event15 = new Event(e15Str, 15, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        String e16Str = "You calmly lean your back against the wall and wait. When you blink, you can't see the old man in front of you. It was as if he had disappeared into the air. After a few days alone, the soldiers say you're free in exchange for coming and telling them what happened. And they don't have the attitude of asking for it, they are literally forcing you to do it. When you tell them what happened and come out, you're going straight to your cousin's house. She seems surprised to see you. She's looking at you with a note and a bag of gold. “Yesterday, a note from Saint Lightning saying 'paid dogs' came to my door, and now this is it. What's going on?\" when you approached her and read the note, “You are free now. – Conqueror Term”";
        Event event16 = new Event(e16Str, 16, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        String e17Str = "When you agree to escape, the old man suddenly pulls out a dagger and slits his own throat. There are two men in black robes, all covered in blood. “We are kidnapping you” and they take your arm and lead you through some corridors. When you go out, \"Your cousin is wondering about you\" they accompany you to your cousin's house. As soon as you open the door, you see your cousin covered in blood on the floor. Then the men behind you shout \"PAID DOGS\" and run over you. You feel like someone is holding you while the other is stabbing you. When you fall to the ground, you see that they burn your house. That's the last thing you see anyway.";
        Event event17 = new Event(e17Str, 17, -100, -100, -100, -100, storyController.player, new Actor(), "END", "END", "END", "END", false, false);

        this.addEvent(event1);
        this.addEvent(event2);
        this.addEvent(event3);
        this.addEvent(event4);
        this.addEvent(event5);
        this.addEvent(event6);
        this.addEvent(event7);
        this.addEvent(event8);
        this.addEvent(event9);
        this.addEvent(event10);
        this.addEvent(event11);
        this.addEvent(event12);
        this.addEvent(event13);
        this.addEvent(event14);
        this.addEvent(event15);
        this.addEvent(event16);
        this.addEvent(event17);

    }
}
