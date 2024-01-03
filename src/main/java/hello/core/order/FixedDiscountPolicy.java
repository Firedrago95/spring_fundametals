package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return 1000;
        }
        return 0;
    }
}
