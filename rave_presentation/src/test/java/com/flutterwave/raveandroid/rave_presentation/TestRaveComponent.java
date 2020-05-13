package com.flutterwave.raveandroid.rave_presentation;

import com.flutterwave.raveandroid.rave_presentation.account.AccountHandler;
import com.flutterwave.raveandroid.rave_presentation.account.AccountHandlerTest;
import com.flutterwave.raveandroid.rave_presentation.ach.AchHandler;
import com.flutterwave.raveandroid.rave_presentation.ach.AchHandlerTest;
import com.flutterwave.raveandroid.rave_presentation.banktransfer.BankTransferHandler;
import com.flutterwave.raveandroid.rave_presentation.banktransfer.BankTransferHandlerTest;
import com.flutterwave.raveandroid.rave_presentation.card.CardPaymentHandler;
import com.flutterwave.raveandroid.rave_presentation.card.CardPaymentHandlerTest;
import com.flutterwave.raveandroid.rave_presentation.francmobilemoney.FrancMobileMoneyHandler;
import com.flutterwave.raveandroid.rave_presentation.francmobilemoney.FrancMobileMoneyHandlerTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestNetworkModule.class, TestUtilsModule.class})
public interface TestRaveComponent {

    void inject(AccountHandler paymentHandler);

    void inject(AccountHandlerTest test);

    void inject(AchHandler paymentHandler);

    void inject(AchHandlerTest test);

    void inject(BankTransferHandler paymentHandler);

    void inject(BankTransferHandlerTest test);

    void inject(CardPaymentHandler paymentHandler);

    void inject(CardPaymentHandlerTest test);

    void inject(FrancMobileMoneyHandler paymentHandler);

    void inject(FrancMobileMoneyHandlerTest test);

}