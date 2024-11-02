package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;


public class CarClient {

    public static void main(String[] args) {
        IScorpio standardScorpio = new StandardScorpio();
        IScorpio advancedScorpio = new AdvancedScorpio();

        Brake standardBrake = new StandardBrake();
        Brake advancedBrake = new AdvancedBrake();
        AdvancedBrake advancedBrake2 = new AdvancedBrake();

//      Its check the runtime object type while calling the WhatsMyName - first dispatch
        standardScorpio.applyBrake(standardBrake);
//      It matches the reference type(Standard or Advanced) of brake object while executing apply break
//      but calling playSound of advanced brake due to runtime dispatch - second dispatch
        advancedScorpio.applyBrake(advancedBrake);
        advancedScorpio.applyBrake(advancedBrake2);
    }
}
