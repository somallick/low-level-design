package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.problem;

public class Scorpio {
    public String whatYourName(){
        return "Scorpio";
    }
    public void applyBreak(StandardBrake standardBrake){
        System.out.println(whatYourName() + " ne mara standard brake aur nikla " + standardBrake.playSound());
    }
    public void applyBreak(AdvancedBrake advancedBrake){
        System.out.println(whatYourName() + " ne mara advanced brake aur nikla " + advancedBrake.playSound());
    }
}
