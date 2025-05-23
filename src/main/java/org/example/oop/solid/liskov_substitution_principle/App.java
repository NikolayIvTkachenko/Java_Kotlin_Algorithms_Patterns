package org.example.oop.solid.liskov_substitution_principle;

import org.example.oop.solid.liskov_substitution_principle.bad.Member;
import org.example.oop.solid.liskov_substitution_principle.good.TournamentJoiner;
import org.example.oop.solid.liskov_substitution_principle.good.TournamentOrganizer;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow LSP:\n");

        List<Member> members1 = List.of(
                new org.example.oop.solid.liskov_substitution_principle.bad.PremiumMember("Jack Hores"),
                new org.example.oop.solid.liskov_substitution_principle.bad.VipMember("Tom Johns"),
                new org.example.oop.solid.liskov_substitution_principle.bad.FreeMember("Martin Vilop")
        );

        // this code respects LSP
        for (Member member : members1) {
            member.joinTournament();
        }

        System.out.println();

        // this code breaks LSP
        // a free member cannot organize tournaments
        for (Member member : members1) {
            member.organizeTournament();
        }

        System.out.println("\nApproach that follow LSP:\n");

        List<TournamentJoiner> members2 = List.of(
                new org.example.oop.solid.liskov_substitution_principle.good.PremiumMember("Jack Hores"),
                new org.example.oop.solid.liskov_substitution_principle.good.VipMember("Tom Johns"),
                new org.example.oop.solid.liskov_substitution_principle.good.FreeMember("Martin Vilop")
        );

        List<TournamentOrganizer> members3 = List.of(
                new org.example.oop.solid.liskov_substitution_principle.good.PremiumMember("Jack Hores"),
                new org.example.oop.solid.liskov_substitution_principle.good.VipMember("Tom Johns")
        );

        // this code respects LSP
        for (TournamentJoiner member : members2) {
            member.joinTournament();
        }

        System.out.println();

        // this code respects LSP
        for (TournamentOrganizer member : members3) {
            member.organizeTournament();
        }
    }
}
