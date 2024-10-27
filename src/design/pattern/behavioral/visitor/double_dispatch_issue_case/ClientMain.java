package src.design.pattern.behavioral.visitor.double_dispatch_issue_case;

public class ClientMain {
    public static void main(String[] args) {

        Scorpio standardScorpio = new Scorpio();
        Scorpio advancedScorpio = new AdvancedScorpio();

        StandardBrake standardBrake = new StandardBrake();
        StandardBrake advancedBrake = new AdvancedBrake();
        AdvancedBrake advancedBrake2 = new AdvancedBrake();

//      Its check the runtime object type while calling the WhatsMyName - first dispatch
        standardScorpio.applyBreak(standardBrake);
//      It matches the reference type(Standard or Advanced) of brake object while executing apply break
//      but calling playSound of advanced brake due to runtime dispatch - second dispatch
        advancedScorpio.applyBreak(advancedBrake);
        advancedScorpio.applyBreak(advancedBrake2);

    }
}
