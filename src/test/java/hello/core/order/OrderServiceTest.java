package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void 주문테스트() {
       long memberId = 1L;
       Member member = new Member(memberId, "memberA", Grade.VIP);
       memberService.join(member);

       Order order = orderService.createOrder(memberId, "gun", 10000);
        Assertions.assertThat(order.getDisCountPrice()).isEqualTo(1000);
    }
}
