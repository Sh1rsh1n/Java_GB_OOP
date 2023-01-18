package seminars.seminar6.task1.isp;

public class WithdrawOperation {
    private UI ui;

    public WithdrawOperation(UI ui) {
        this.ui = ui;
    }

    public void execute () {
        int amount = ui.getWithdrawSum();
        // ...
        System.out.println("Заберите деньги");
    }
}
