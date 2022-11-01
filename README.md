# Mobile Programing Home Work

## Description
기본적인 회원 가입과 로그인 상품 페이지로 구성 되어있으며, 
회원 아이디 중복의 경우 회원가입 버튼을 누르게 되면 확인하여 알람으로 보여줌
모든 알람의 기능은 Toast를 이용해서 구현함
비밀번호 규칙의 경우 영문자, 숫자, 특수 기호가 들어간 8 자리 이상의 비밀번호만 가능함
기존 유저의 가입 정보는 안드로이드에서 자체적으로 제공해주는 Room 데이터 베이스를 통해서 제공함
로그인된 유저의 정보는 전역 변수로 관리함
따로 로그아웃 기능은 업음
맨처음 페이지에서 '비회원으로' 를 클릭하면 로그아웃과 비슷한 기능을 제공함
메인 버튼 (상품 출력 페이지)을 비회원으로 라고 작성함
상품 리스트는 5개가 보이고 전부 고양이 사진을 넣어둠
로그인이 되어 있으면 회원 정보가 보이고 아니면 회원 가입을 원하는지 물어봄


## Environment

- Target SDK => Android 12L (SDK 32)
- Min SDK => Android 12 (SDK 31)
- Java Version 1.8



## Build gradle plugins

- com.android.application 7.3.0
- com.android.library 7.3.0

## Build gradle dependencies

- androidx.appcompat:appcompat 1.5.1
- com.google.android.material:material 1.7.0
- androidx.constraintlayout:constraintlayout 2.1.4
- androidx.room:room-runtime 2.4.3
- com.google.firebase:firebase-crashlytics-buildtools 2.9.2
- junit:junit 4.13.2
- androidx.test.ext:junit 1.1.3
- androidx.test.espresso:espresso-core 3.4.0
- androidx.room:room-compiler 2.4.3


p.s 간혹 오류 발생시 Clean Project를 누르면 정상 작동 합니다.