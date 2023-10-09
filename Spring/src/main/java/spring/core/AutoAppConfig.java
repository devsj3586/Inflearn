package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.core.member.MemberRepository;
import spring.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        /*
            basePackages : 탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색
            basePackageClasses : 지정한 클래스의 패키지를 탐색 시작 위치로 지정한다
            default :  @ComponentScan 이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
            추천 : 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것이다. 최근 스프링 부트도 이 방법을 기본으로 제공한다.
         */
        // excludeFilters 를 이용해서 설정정보는 컴포넌트 스캔 대상에서 제외 -> AppConfig.class 에 @Configuration 이 있어서 제외
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    /*
        ComponentScan 강제로 중복 등록 test  수동 vs 자동
        수동 빈등록이 우선권을 가진다. (수동 빈이 자동 빈을 오버라이딩 해버린다)
        스프링 부트는 수동 빈 등록과 자동 빈 등록이 충돌나면 오류가 발생하도록 기본 값을 바꾸었다
     */
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
