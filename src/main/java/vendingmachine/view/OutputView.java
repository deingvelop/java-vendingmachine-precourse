package vendingmachine.view;

import vendingmachine.domain.dto.response.CoinDto;

import java.util.List;

import static vendingmachine.view.OutputMessageFactory.createErrorMessage;
import static vendingmachine.view.OutputView.Message.MACHINE_MONEY_INFO_MESSAGE;

public class OutputView {

    public static void printError(Exception e) {
        String errorMessage = createErrorMessage(e.getMessage());

        System.out.println();
        System.out.println(errorMessage);
    }

    public static void printInitCoins(List<CoinDto> coinDtos) {
        String coinInfo = OutputMessageFactory.createCoinInfo(coinDtos);

        System.out.println();
        System.out.println(MACHINE_MONEY_INFO_MESSAGE);
        System.out.println(coinInfo);
    }

    public static void printUserMoney(int userMoney) {
        String userMoneyInfo = OutputMessageFactory.createUserMoneyInfo(userMoney);

        System.out.println();
        System.out.println(userMoneyInfo);
    }

    static class Message {
        static final String MACHINE_MONEY_INFO_MESSAGE = "자판기가 보유한 동전";
    }

}
