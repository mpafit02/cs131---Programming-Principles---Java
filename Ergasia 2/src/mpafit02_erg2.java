/**
 * Author: Marios Pafitis Written: 12/10/2017 Last updated: 26/10/2017
 *
 * Compilation: javac mpafit02_erg2.java Execution: java mpafit02_erg2
 *
 * To programma einai mia anaprastasi tou paixnidiou Blackjack opou exoume enan
 * Dealer (PC) kai ton Player (User). Anakatevoume mia trapoula 52 fullon. O
 * Player exei tin dinatotita na paiksei osous gurous thelei. Stin arxi kathe
 * gurou stoiximatizei ena arxiko poso. Akolouthos o Dealer dinei duo fulla ston
 * Player kai stone auto tou. O idios ta gnorizei eno o User gnwrizei mono to
 * ena. An o User exei natural Blackjack diladi ena Ace kai ena apo ta xartia
 * “10, Jack, Queen, King” tou epistrefetai to 1.5 tis aksias tou stoiximatos
 * tou kai o guros teleiwnei. O Ace exei aksia eite 1 eite 11 analogos to ti
 * eksipiretei ton Player kai antistoixa ton Dealer. An kaei o Player i o Dealer
 * analoga pios exei ton Ace, diladi I aksia twn fillwn tou einai megaluteri tou
 * 21, ton metroume san 1 kai oxi san 11. Ta fulla “Jack, Queen, King” exoun
 * aksia 10 kai ta upoloipa xartia tin antistoixi tou arithmou tous. Stin
 * periptosi pou o User den exei natural Blackjack o Dealer elexei ta dika tou
 * fulla. Stin periptosi pou exei ekeinos natural Blackjack tote o User xanei to
 * stoixima tou kai o guros termatizetai. Ean to fillo tou Dealer to oipo
 * gnorizei o User einai Ace tote o Dealer ton rota an thelei na mirasei to
 * stoixima tou, etsi oste stin periptosi pu exei Blackjack o Dealer na min to
 * xasei olokliro. An kanenas apo tous duo den exei natural Blackjack o Dealer
 * rota ton User na epileksei mian apo tis epomenes kiniseis: 1. Hit //na tou
 * dosei o Dealer ena neo xarti apo tin trapoula 2. Stand //na paraminei o User
 * me ta filla pou exei kai na sinexisei o Dealer me tin seira tou. 3.Double
 * //na diplasiasei to stoiximatou kai na parei ena mono xarti. 4.Surrender //na
 * tou epistrafei to miso stoixima kai o guros na teleiosei. O Player exei
 * dinatotita na epileksei tin epilogi 4 mono stin arxi tou kathe gurou. An
 * epileksei tin epilogi Double ousiastika diplasiazei to stoixima tou, kanei
 * Hit afou pernei ena xarti kai Stand enantia sta xartia tou Dealer. An o
 * Player i o Dealer exoun xarrtia opou I aksia tous kseperna to 21 tote
 * kaigontai. I aksia to Stin periptosi pou kaei o Dealer, tote o Player
 * kerdizei to stoixima tou, alios ean o Player kaei xanei to stoixima tou. An
 * meta apo mia seira epilogon Hit o Player exei sinoliki aksia fillon 21 tote
 * exei Blackjack kai kerdizei ton guro epistrefontas tou, to stoixima tou. An
 * einai I seira tou Dealer na paiksei tote einai anagkasmenos na parei nea
 * fulla mexri to athroisma tous na einai megalitero tou 17. Meta sugkrinontai
 * ta fulla tou Player me ton Dealer kai autos pu exei to kalutero athroisma
 * kerdizei. Se periptosei isopalias to stoixima epistrefetai ston Player. Sto
 * telos to programma parousiazei ston Player posa kerdise i exase sinolika se
 * oulous tous gurous mazi.
 *
 * 
 */
public class mpafit02_erg2 {
	// Hit
	public static void Hit(String cardP[], String deck[], int cardValP[], int values[]) {
		cardP[1 + cardValP[11]] = deck[1 + cardValP[11]]; // Take card from array deck and place it in array cardP
		cardValP[1 + cardValP[11]] = values[1 + cardValP[11]]; // Take card value from array values and place
																// it in array cardValP
		cardValP[12] += cardValP[1 + cardValP[11]]; // Increase the total value of Player's cards
		System.out.println("\r\nYour next card is : " + cardP[1 + cardValP[11]]);
		if (isBurn(cardValP[12])) {
			for (int i = 0; i <= (1 + cardValP[11]); i++) {
				if (cardValP[i] == 11) {
					cardValP[12] -= 10;
					cardValP[i] = 1;
				}
			}
		}
	}

	// Stand
	public static void Stand(String cardD[], String deck[], int cardValD[], int values[]) {
		cardD[1 + cardValD[11]] = deck[deck.length / 2 + 1 + cardValD[11]];
		cardValD[1 + cardValD[11]] = values[deck.length / 2 + 1 + cardValD[11]];
		cardValD[12] += cardValD[1 + cardValD[11]]; // Increase the total value of Dealer's cards
		System.out.println("\r\nMy next card is " + cardD[1 + cardValD[11]]);
		if (isBurn(cardValD[12])) {
			for (int i = 0; i <= (1 + cardValD[11]); i++) {
				if (cardValD[i] == 11) {
					cardValD[12] -= 10;
					cardValD[i] = 1;
					break;
				}
			}
		}
	}

	// Double Down
	public static double DoubleDown(double stake, String cardP[], String deck[], int cardValP[], int values[],
			int hitTimesPlayer) {
		stake *= 2;
		cardP[1 + hitTimesPlayer] = deck[1 + hitTimesPlayer];
		cardValP[1 + hitTimesPlayer] = values[1 + hitTimesPlayer];
		System.out.println("\r\nYour final card is : " + cardP[1 + hitTimesPlayer]);
		return stake;
	}

	// Burn
	public static boolean isBurn(int points) {
		if (points <= 21) {
			return false;
		} else {
			return true;
		}
	}

	// Deck Shuffle
	public static String[] createShuffleDeck(int values[]) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int SUITS = suit.length;
		int RANKS = rank.length;
		int N = SUITS * RANKS;
		String[] deck = new String[N];

		for (int i = 0; i < RANKS; i++)
			for (int j = 0; j < SUITS; j++) {
				deck[SUITS * i + j] = rank[i] + " of " + suit[j];
				if (i < 9) {
					values[SUITS * i + j] = i + 2;
				} else if (i == 12) {
					values[SUITS * i + j] = 11;
				} else {
					values[SUITS * i + j] = 10;
				}
			}

		for (int i = 0; i <= 100000; i++) {
			int c1 = (int) (Math.random() * N);
			int c2 = (int) (Math.random() * N);
			String t = deck[c1];
			deck[c1] = deck[c2];
			deck[c2] = t;
			// mix array values the same way as deck array
			int d = values[c1];
			values[c1] = values[c2];
			values[c2] = d;
		}
		return deck;
	}

	public static void main(String[] args) {
		// Variables
		int values[] = new int[52], cardValP[] = new int[13], cardValD[] = new int[13];
		int gameRound = 1, end, action, divideStake;
		double valuesP[] = new double[2];
		boolean stop = false;
		String deck[], cardP[] = new String[11], cardD[] = new String[11];
		System.out.println("********  WELCOME TO BLACKJACK  ********");
		// Initialization
		valuesP[0] = 0; // Stake
		valuesP[1] = 0; // Total Money
		while (!stop) {
			// Initialization for each round
			boolean skip = false;
			cardValP[11] = 0; // Player's Hit Times
			cardValP[12] = 0; // Player's Cards Points
			// Start Round
			// Shuffle the Deck
			System.out.println("\r\n\r\n>>>> We are about to start Game number " + gameRound + " <<<<\r\n\r\n");
			deck = createShuffleDeck(values);
			// Read stake
			System.out.print("Enter your stake in Euro: ");
			valuesP[0] = StdIn.readDouble();
			while (valuesP[0] <= 0) {
				System.out.print("Wrong Input - Enter your stake in Euro: ");
				valuesP[0] = StdIn.readDouble();
			}
			// Player's Cards
			System.out.println("\r\nYou have the following two cards:");
			cardP[0] = deck[0];
			cardP[1] = deck[1];
			cardValP[0] = values[0];
			cardValP[1] = values[1];
			cardValP[12] = cardValP[0] + cardValP[1];
			System.out.println("\t" + cardP[0]);
			System.out.println("\t" + cardP[1]);
			// Dealer's Cards
			cardD[0] = deck[deck.length / 2];
			cardD[1] = deck[deck.length / 2 + 1];
			cardValD[0] = values[deck.length / 2];
			cardValD[1] = values[deck.length / 2 + 1];
			cardValD[12] = cardValD[0] + cardValD[1];
			System.out.println("\r\nThe first of my initial two cards is " + cardD[0]);
			// Case of Natural Blackjack
			if (cardValP[12] == 21) {
				valuesP[0] *= 1.5;
				valuesP[1] += valuesP[0];
				System.out.printf("\r\nNatural Blackjack for you!!! You have just won %.1f Euro\r\n", valuesP[0]);
			} else if ((cardValD[12] == 21) && (cardValP[12] != 21)) {// Case Dealer has Natural Blackjack
				if ((values[deck.length / 2] != 1) && (values[deck.length / 2] != 11)) {
					System.out.println("\r\nMy second initial card is " + cardD[1]);
					System.out.println("\r\nAs you see I have a natural blackjack, so you lose your stake");
					valuesP[1] -= valuesP[0];
				} else if ((values[deck.length / 2] == 1) || (values[deck.length / 2] == 11)) { // Case Dealer's first
																								// card is an Ace(option
																								// to divide stake in
																								// half)
					System.out.print("\r\nMy first card is an Ace, do you want to divide in half your stake?:\r\n"
							+ "\t1. Yes\r\n" + "\t2. No\r\n" + "Enter chosen action: ");
					divideStake = StdIn.readInt();
					if (divideStake == 1) {
						valuesP[0] /= 2;
					}
					System.out.println("\r\nMy second initial card is " + cardD[1]);
					System.out.println("\r\nAs you see I have a natural blackjack, so you lose your stake");
					valuesP[1] -= valuesP[0];
				}
				// None has Natural Blackjack
			} else {
				if ((values[deck.length / 2] == 1) || (values[deck.length / 2] == 11)) { // Case Dealer's first card is
																							// an Ace(option to divide
																							// stake in half)

					System.out.print("\r\nMy first card is an Ace, do you want to divide in half your stake?:\r\n"
							+ "\t1. Yes\r\n" + "\t2. No\r\n" + "Enter chosen action: ");
					divideStake = StdIn.readInt();
					while ((divideStake != 1) && (divideStake != 2)) {
						System.out.print("Wrong Input - Enter chosen action: ");
						divideStake = StdIn.readInt();
					}
					if (divideStake == 1) {
						valuesP[0] /= 2;
						skip = true;
					}
				}
				// Player's Turn
				if (!skip) {
					System.out.println("\r\nYour turn to play!!");
					System.out.print(
							"\r\nPlease select one of the following actions:\r\n" + "\t1. Hit\r\n" + "\t2. Stand\r\n"
									+ "\t3. Double Down\r\n" + "\t4. Surrender\r\n" + "Enter chosen action: ");

					action = StdIn.readInt();
					while ((action != 1) && (action != 2) && (action != 3) && (action != 4)) {
						System.out.print("Wrong Input - Enter chosen action: ");
						action = StdIn.readInt();
					}
				} else {
					System.out.println("\r\nYour turn to play!!");
					System.out.print("\r\nPlease select one of the following actions:\r\n" + "\t1. Hit\r\n"
							+ "\t2. Stand\r\n" + "\t3. Double Down\r\n" + "Enter chosen action: ");
					action = StdIn.readInt();
					while ((action != 1) && (action != 2) && (action != 3)) {
						System.out.print("Wrong Input - Enter chosen action: ");
						action = StdIn.readInt();
					}
				}
				while (action == 1) {
					cardValP[11]++;
					Hit(cardP, deck, cardValP, values);
					if (cardValP[12] == 21) {
						System.out.printf("\r\nBlackjack for you!!! You have just won %.1f Euro\r\n", valuesP[0]);
						valuesP[0] *= 1.5;
						valuesP[1] += valuesP[0];
						action = 0;
					} else if (isBurn(cardValP[12])) {
						valuesP[1] -= valuesP[0];
						System.out.printf("\r\nYou have been burned and have lost %.1f Euro\r\n", valuesP[0]);
						action = 0;
					} else {
						System.out.print("\r\nPlease select one of the following actions:\r\n" + "\t1. Hit\r\n"
								+ "\t2. Stand\r\n" + "\t3. Double Down\r\n" + "Enter chosen action: ");
						action = StdIn.readInt();
						while ((action != 1) && (action != 2) && (action != 3)) {
							System.out.print("Wrong Input - Enter chosen action: ");
							action = StdIn.readInt();
						}
					}
				}
				// Case of action is 2
				if (action == 2) {
					System.out.println("\r\nMy turn to play ...");
					System.out.println("\r\nMy second initial card is " + cardD[1]);
					while (cardValD[12] <= 17) {
						cardValD[11]++;
						Stand(cardD, deck, cardValD, values);
					}
					System.out.printf("\r\nI am stopping ...\r\n");
					if (cardValD[12] != cardValP[12]) {
						if (cardValD[12] == 21) {
							System.out.printf("\r\nBlackjack for me!!! You have just lost %.1f Euro \r\n", valuesP[0]);
							valuesP[1] -= valuesP[0];
						} else if (cardValD[12] > 21) {
							System.out.printf("\r\nI have burned myself and you win %.1f Euro \r\n", valuesP[0]);
							valuesP[1] += valuesP[0];
						} else if ((cardValD[12] > cardValP[12]) && (cardValD[12] < 21)) {
							System.out.printf("\r\nYou have lost %.1f Euro \r\n", valuesP[0]);
							valuesP[1] -= valuesP[0];
						} else if (cardValD[12] < cardValP[12]) {
							System.out.printf("\r\nYou have won %.1f Euro \r\n", valuesP[0]);
							valuesP[1] += valuesP[0];
						}
					} else {
						System.out.printf("\r\nDraw! You are not losing anything.\r\n");
					}
				}
				// Case of action is 3
				if (action == 3) {
					cardValP[11]++;
					valuesP[0] *= 2;
					Hit(cardP, deck, cardValP, values);
					if (cardValP[12] == 21) {
						System.out.printf("\r\nBlackjack for you!!! You have just won %.1f Euro\r\n", valuesP[0]);
						valuesP[0] *= 1.5;
						valuesP[1] += valuesP[0];
						action = 0;
					} else if (isBurn(cardValP[12])) {
						valuesP[1] -= valuesP[0];
						System.out.printf("\r\nYou have been burned and have lost %.1f Euro\r\n", valuesP[0]);
						action = 0;
					} else {
						System.out.println("\r\nMy turn to play ...");
						System.out.println("\r\nMy second initial card is " + cardD[1]);
						while ((cardValD[12] <= 17) && (cardValD[12] < 21)) {
							Stand(cardD, deck, cardValD, values);
						}
						System.out.printf("\r\nI am stopping ...\r\n");
						if (cardValD[12] != cardValP[12]) {
							if (cardValD[12] == 21) {
								System.out.printf("\r\nBlackjack for me!!! You have just lost %.1f Euro \r\n",
										valuesP[0]);
								valuesP[1] -= valuesP[0];
							} else if (cardValD[12] > 21) {
								System.out.printf("\r\nI have burned myself and you win %.1f Euro \r\n", valuesP[0]);
								valuesP[1] += valuesP[0];
							} else if ((cardValD[12] > cardValP[12]) && (cardValD[12] < 21)) {
								System.out.printf("\r\nYou have lost %.1f Euro \r\n", valuesP[0]);
								valuesP[1] -= valuesP[0];
							} else if (cardValD[12] < cardValP[12]) {
								System.out.printf("\r\nYou have won %.1f Euro \r\n", valuesP[0]);
								valuesP[1] += valuesP[0];
							}
						} else {
							System.out.println("\r\nDraw! You are not losing anything.\r\n");
						}
					}
				}
				if ((action == 4) && (cardValP[11] == 0)) {
					valuesP[0] /= 2;
					valuesP[1] -= valuesP[0];
					System.out.printf("\r\nBy surrendering you only lose %.1f Euro\r\n", valuesP[0]);
				}
			}
			// Do you want to continue?
			System.out.print("\r\nDo you want to continue?\r\n" + "\t1. CONTINUE\r\n" + "\t2. STOP\r\n"
					+ "Enter chosen action: ");
			end = StdIn.readInt();
			while ((end != 1) && (end != 2)) {
				System.out.print("Wrong Input - Enter chosen action: ");
				end = StdIn.readInt();
			}
			switch (end) {
			case 1:
				stop = false;
				break;
			case 2:
				stop = true;
				if (valuesP[1] > 0) {
					System.out.printf("\r\n\r\nYou have won %.1f Euro. Lucky you!!\r\n\r\n", valuesP[1]);
				} else if (valuesP[1] < 0) {
					System.out.printf("\r\n\r\nYou have lost %.1f Euro. Next time luckier.\r\n\r\n",
							Math.abs(valuesP[1]));
				} else {
					System.out.printf("\r\n\r\nYou have not won anything. Next time luckier.\r\n\r\n");
				}
				System.out.println("********  GOODBYE - COME AGAIN  **********");
				break;
			}
			gameRound++;
		}
	}
}