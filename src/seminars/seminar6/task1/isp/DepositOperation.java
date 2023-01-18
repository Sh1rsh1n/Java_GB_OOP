package seminars.seminar6.task1.isp;

public class DepositOperation {
    private UI ui;

    public DepositOperation(UI ui) {
        this.ui = ui;
    }

    public void execute () {
        int amount = ui.getDepositSum();
        // ...
        System.out.println("Деньги зачислены на счёт");
    }
}
