# SpringPractice

--------------------------------
[스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard)
실습 <br>

## 실습환경<br>

- Project: Gradle Project
- Spring Boot: 2.6.7
- Language: Java
- Packaging: Jar
- Java: 11
- Dependencies: Spring Web, Thymeleaf + OJDBC8

## 강의 목차<br>

1. 객체 지향 설계와 스프링
2. 스프링 핵심 원리 이해1 - 예제 만들기
3. 스프링 핵심 원리 이해2 - 객체 지향 원리 적용
4. 스프링 컨테이너와 스프링 빈
5. 싱글톤 컨테이너
6. 컴포넌트 스캔
7. 의존관계 자동 주입
8. 빈 생명주기 콜백
9. 빈 스코프

## 학습 내용 정리<br>
> #### 스프링 프레임워크
>> - 핵심 기술: 스프링 DI 컨테이너, AOP, 이벤트, 기타 <br>
>> - 웹 기술: 스프링 MVC, 스프링 WebFlux <br>
>> - 데이터 접근 기술: 트랜잭션, JDBC, ORM 지원, XML 지원 <br>
>> - 기술 통합: 캐시, 이메일, 원격접근, 스케줄링 <br>
>> - 테스트: 스프링 기반 테스트 지원 <br>
>> - 언어: 코틀린, 그루비 <br>
>> - 최근에는 스프링 부트를 통해서 스프링 프레임워크의 기술들을 편리하게 사용 <br>
>
> #### 스프링 부트 특징
>> - 스프링을 편리하게 사용할 수 있도록 지원, 최근에는 기본으로 사용
>> - 단독으로 실행할 수 있는 스프링 애플리케이션을 쉽게 생성
>> - Tomcat 같은 웹 서버를 내장해서 별도의 웹 서버를 설치하지 않아도 됨
>> - 손쉬운 빌드 구성을 위한 starter 종속성 제공
>> - 스프링과 3rd parth(외부) 라이브러리 자동 구성
>> - 메트릭, 상태 확인, 외부 구성 같은 프로덕션 준비 기능 제공
>> - 관례에 의한 간결한 설정
>
> #### 스프링의 핵심
>> - 스프링은 자바 언어 기반의 프레임워크
>> - 자바 언어의 가장 큰 특징 - 객체 지향 언어
>> - 스프링은 객체 지향 언어가 가진 강력한 특징을 살려내는 프레임워크
>> - 스프링은 좋은 객체 지향 애플리케이션을 개발할 수 있게 도와주는 프레임워크
>
> #### 객체 지향 프로그래밍
>>
> 
> #### 좋은 객체 지향 설계의 5가지 원칙 (SOLID)
>> - SRP: 단일 책임 원칙(single responsibility principle)<br>
>> - OCP: 개방-폐쇄 원칙 (Open/closed principle)<br>
>> - LSP: 리스코프 치환 원칙 (Liskov substitution principle)<br>
>> - ISP: 인터페이스 분리 원칙 (Interface segregation principle)<br>
>> - DIP: 의존관계 역전 원칙 (Dependency inversion principle)<br>

> #### Spring Annotation
>> - @ComponentScan
>>   - @Component 어노테이션이 붙은 모든 클래스를 스프링 빈으로 등록.
>>   - 빈 이름 기본전략 : MemberServiceImpl -> memberServiceImpl
>>   - 빈 이름 직접지정 : 스프링 빈의 이름을 직접 지정하고 싶으면 @Component("원하는 이름")의 형태로 이름 지정 가능
>>   - 스프링 부트로 프로젝트를 생성한 경우 @SpringBootApplication 내부에 @ComponentScan 에노테이션이 포함되어 있음
>> - @Component
>>   - ComponentScan의 기본 등록 대상
>> - @Controller
>>   - 스프링 MVC 컨트롤러에서 사용
>> - @Service
>>   - 스프링 비즈니스 로직에서 사용
>> - @Autowired
>>   - 생성자에 사용할 경우 스프링 컨테이너가 자동으로 해당 스프링 빈을 찾아서 주입

## 추가 학습 목표<br>

- H2 DB -> 오라클클라우드 DB(연결 완료)


## 추가 학습 내용 정리
### 단위 테스트
> #### 단위 테스트 VS 통합 테스트
>> - 단위테스트
>>   - 하나의 모듈을 기준으로 독립적으로 진행되는 가장 작은 단위의 테스트
>>   - 하나의 기능이 올바르게 동작하는지를 독립적으로 테스트하는 것이 목적
>>
>> - 통합테스트
>>   - 모듈을 통합하는 과정에서 모듈 간의 호환성을 확인하기 위해 수행되는 테스트
>>   - 독립적인 기능에 대한 테스트가 아니라 웹 페이지로부터 API를 호출하여 올바르게 동작하는 지를 확인하는 것이 목적
> #### 좋은 테스트 코드의 5가지 특징(FIRST)
>> - Fast: 테스트는 빠르게 동작하여 자주 돌릴 수 있어야 한다. 
>> - Independent: 각각의 테스트는 독립적이며 서로 의존해서는 안된다. 
>> - Repeatable: 어느 환경에서도 반복 가능해야 한다. 
>> - Self-Validating: 테스트는 성공 또는 실패로 bool 값으로 결과를 내어 자체적으로 검증되어야 한다. 
>> - Timely: 테스트는 적시에 즉, 테스트하려는 실제 코드를 구현하기 직전에 구현해야 한다.
> #### 필요 라이브러리
>> - JUnit5: 자바 단위 테스트를 위한 테스팅 프레임워크
>> - AssertJ: 자바 테스트를 돕기 위해 다양한 문법을 지원하는 라이브러리
> #### given/when/then 패턴
>> - given(준비): 어떠한 데이터가 준비되었을 때
>> - when(실행): 어떠한 함수를 실행하면
>> - then(검증): 어떠한 결과가 나와야 한다.
> - TestCode 기본형식(given/when/then 패턴)   
>    ```java
>    @Test 
>    @DisplayName("테스트 내용을 파악 가능한 이름(한글 가능)") 
>    void UnitTestExample() {
>        // given
>            
>        // when
>            
>        // then 
>            
>    }


--------------------------------

### 오라클클라우드 연결

- [오라클 연결 설정](https://github.com/Quence1151/spring-pra/blob/main/README.md)

