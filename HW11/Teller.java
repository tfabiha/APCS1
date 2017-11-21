// Team Kitkat - Tabassum Fabiha, Kaitlin Wan, Bill Ni
// APCS1 pd2
// HW11 -- Breaking the Bank
// 2017-10-03

public class Teller{
	public static void main( String[] args ){
		BankAccount extTest = new BankAccount();

		//setName test
		extTest.setName("Extensive Test");

		//setPasswd test
		extTest.setPasswd("expass");

		//setPin invalid pin test (std case) (less than range)
		System.out.println("setPin invalid pin test (std case) (less than range)");
		extTest.setPin(345);
		System.out.println("============");

		//setPin invalid pin test (edge case) (less than range)
		System.out.println("setPin invalid pin test (edge case) (less than range)");
		extTest.setPin(999);
		System.out.println("============");

		//setPin invalid pin test (edge case) (more than range)
		System.out.println("setPin invalid pin test (edge case) (more than range)");
		extTest.setPin(10000);
		System.out.println("============");

		//setPin invalid pin test (std case) (more than range)
		System.out.println("setPin invalid pin test (std case) (more than range)");
		extTest.setPin(12345);
		System.out.println("============");

		//setPin valid pin test (edge case) (in range)
		System.out.println("setPin valid pin test (edge case) (in range)");
		extTest.setPin(1000);
		System.out.println("============");

		//setPin valid pin test (std case) (in range)
		System.out.println("setPin valid pin test (std case) (in range)");
		extTest.setPin(1234);
		System.out.println("============");

		//setPin valid pin test (edge case) (in range)
		System.out.println("setPin valid pin test (edge case) (in range)");
		extTest.setPin(9999);
		System.out.println("============");

		//setAcctNum invalid number test (std case) (less than range)
		System.out.println("setAcctNum invalid number test (std case) (less than range)");
		extTest.setAcctNum(12345);
		System.out.println("============");

		//setAcctNum invalid number test (edge case) (less than range)
		System.out.println("setAcctNum invalid number test (edge case) (less than range)");
		extTest.setAcctNum(99999999);
		System.out.println("============");

		//setAcctNum invalid number test (edge case) (more than range)
		System.out.println("setAcctNum invalid number test (edge case) (more than range)");
		extTest.setAcctNum(999999999);
		System.out.println("============");

		//setAcctNum invalid number test (std case) (more than range)
		System.out.println("setAcctNum invalid number test (std case) (more than range)");
		extTest.setAcctNum(1234567890);
		System.out.println("============");

		//setAcctNum valid number test (edge case) (in range)
		System.out.println("setAcctNum valid number test (edge case) (in range)");
		extTest.setAcctNum(100000000);
		System.out.println("============");

		//setAcctNum valid number test (std case) (in range)
		System.out.println("setAcctNum valid number test (std case) (in range)");
		extTest.setAcctNum(123456789);
		System.out.println("============");

		//setAcctNum valid number test (edge case) (in range)
		System.out.println("setAcctNum valid number test (edge case) (in range)");
		extTest.setAcctNum(999999998);
		System.out.println("============");

		//setBalance test
		extTest.setBalance(800000.0);

		//deposit test
		extTest.deposit(200000.0);

		//withdraw invalid amount test (std case) (more than range)
		System.out.println("withdraw invalid amount test (std case) (more than range)");
		extTest.withdraw(10000000.0);
		System.out.println("============");

		//withdraw invalid amount test (edge case) (more than range)
		System.out.println("withdraw invalid amount test (edge case) (more than range)");
		extTest.withdraw(1000001.0);
		System.out.println("============");

		//withdraw valid amount test (edge case) (in range)
		System.out.println("withdraw valid amount test (edge case) (in range)");
		extTest.withdraw(1000000.0);
		System.out.println("============");

		//reset balance so we can withdraw again
		extTest.setBalance(800000.0);

		//withdraw valid amount test (std case) (in range)
		System.out.println("withdraw valid amount test (std case) (in range)");
		extTest.withdraw(500000.0);
		System.out.println("============");

		//authenticate test invalid acctNum and passwd
		System.out.println("authenticate test invalid acctNum and passwd");
		extTest.authenticate(987654321,"randomPsswd");
		System.out.println("============");

		//authenticate test valid acctNum invalid passwd
		System.out.println("authenticate test valid acctNum invalid passwd");
		extTest.authenticate(999999998,"randomPsswd");
		System.out.println("============");

		//authenticate test invalid acctNum valid passwd
		System.out.println("authenticate test invalid acctNum valid passwd");
		extTest.authenticate(123456789,"expass");
		System.out.println("============");

		//authenticate test valid acctNum and passwd
		System.out.println("authenticate test valid acctNum and passwd");
		extTest.authenticate(999999998,"expass");
		System.out.println("============");

		//toString test
		System.out.println("toString test");
		System.out.println(extTest);
	}
}