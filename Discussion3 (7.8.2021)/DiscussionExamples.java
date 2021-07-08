import tester.*;
class DiscussionExamples{
    int hourToSecond(int hours){
        return hours * 1000;
        //return hours * 60 * 60;
    }

    boolean testAnything(Tester t){
        return t.checkExpect(hourToSecond(1), 3600) && t.checkExpect(hourToSecond(2), 7200);
    }
}