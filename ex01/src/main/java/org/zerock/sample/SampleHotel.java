package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {
	//묵시적 자동 주입 :
	//스프링의 의존성 주입은 생성자 주입과 세터 주입을 자주 사용한다.
	//생성자 주입은 롬북이 알아서 파라미터를 만들어 줌.
	//세터 주입은 값을 저장시 자동 객체를 생성함. @Setter(onMethod_ = @Autowired)
	
	private Chef chef;
	
	@NonNull
	private Restaurant restaurant;
	
	@NonNull
	private String name; 
}
