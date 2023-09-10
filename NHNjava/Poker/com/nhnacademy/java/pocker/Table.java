package com.nhnacademy.java.pocker;

public class Table {
    public static void main(String[] args) {

        System.out.println("포커 게임을 시작합니다. ");

        System.out.println("덱을 생성합니다. ");

        Deck deck = new Deck();

        User user1 = new User();
        User user2 = new User();

        System.out.println("각 유저들에게 나눠준 카드는 다음과 같습니다. ");

        user1.setDeck(deck.toUser());
        user2.setDeck(deck.toUser());

        System.out.println("유저 1의 카드 : " + user1);
        System.out.println("유저 2의 카드 : " + user2);

        System.out.println("유저들의 랭크를 비교합니다. ");

        System.out.println("유저 1의 랭크 : " + user1.countPair());

        System.out.println("유저 2의 랭크 : " + user2.countPair());

        System.out.print("랭크를 비교한 결과, " );

        winner(user1, user2);

    }

    private static void winner(User user1, User user2) {

            if(user1.countPair() == Rank.ThreeOfKind){
                System.out.println("유저 1의 승리입니다! ");
            }
            else if(user1.countPair() == Rank.TwoPairs){
                System.out.println("유저 1의 승리입니다! ");
            }

            else if(user1.countPair() == Rank.OnePair && user2.countPair() == Rank.Top){
                System.out.println("유저 1의 승리입니다! ");
            }

            else if (user2.countPair() == Rank.ThreeOfKind){
                System.out.println("유저 2의 승리입니다! ");
            }

            else if(user2.countPair() == Rank.TwoPairs){
                System.out.println("유저 2의 승리입니다! ");
            }

            else if(user1.countPair() == Rank.Top && user2.countPair() == Rank.OnePair){
                System.out.println("유저 2의 승리입니다! ");
            }

            else
                System.out.println("유저 1과 유저2는 비겼습니다.");

        }
    }

