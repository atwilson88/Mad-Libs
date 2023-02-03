public class MadLibs {
    /*
  This program generates a mad libbed story.
  Author: Allyson
  Date: 12/29/2022
  */
    public static void main(String[] args){
        String name1 = "Allyson";
        String adjective1 = "silly";
        String adjective2 = "enormous";
        String noun1 = "she";
        String noun2 = "Kansas City";
        String verb1 = "run";
        String noun3 = "tacos";
        String noun4 = "shoestring";
        String adjective3 = "fast";
        String name2 = "Rictavion";
        String place1 = "the bathroom";
        String noun5 = "internet";
        String noun6 = "desk";
        int number = 14;

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
