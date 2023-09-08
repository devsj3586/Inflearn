package com.example.SpringBasic;

import com.example.SpringBasic.repository.*;
import com.example.SpringBasic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
/**
 * jdcb 사용
 */
//    private DataSource dataSource;
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
    /**
     * JPA사용
     */
//    private EntityManager em;
//    @Autowired
//    public SpringConfig (EntityManager em) {
//        this.em = em;
//    }
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 스프링 데이터 jpa 사용시
     */
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /**
     * jdbc, jpa 사용시
     */
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
    /*
      AOP 빈 등록
     */
//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }
}
