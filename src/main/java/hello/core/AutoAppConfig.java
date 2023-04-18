package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // Component 를 찾아 스프링 빈에 등록
//        basePackages = "hello.core.member", // hello.core.member 부터 스캔
//        basePackageClasses = AutoAppConfig.class,
        // 권장하는 방법(관례)는 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것

        // AppConfig 를 제외하기 위해 Configuration 은 예외처리(Configuration 도 Component 를 갖고 있음)
        // 밑에 코드가 없다면 AppConfig 나 TestConfig 도 자동으로 스프링 빈에 등록됨
        // 일반적인 경우에는 제외하지 않음(예제코드를 보관하기 위한 방법일 뿐임)
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    // 수동 빈 vs 자동 빈 테스트(수동 빈이 우선권을 가짐)
//    // 현재는 버그가 많이 발생해(개발자 의도가 아닌 실수로 인해 겹치는 경우가 대다수) 그냥 오류 터지도록 변경
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
