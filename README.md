# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


---

## 기능요구 사항

    
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.  

* 사용자는 몇번의 이동을 할것인지를 입력할 수 있어야 한다.

* 각 자동차에 이름을 부여할수있다. 전진하는 자동차를 출력할때 자동차 이름을 같이 출력한다.

* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자이하만 가능하다.

* 전진하는 조건은 0에서 9사이에서 random값을 구한 후 random값이 4이상일경우 전진하고,
3이하의 값이면 멈춘다.

* 자동차 경주게임을 완료한 후 누가 우승했는지를 알려준다.

* 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.

* 사용자가 잘못된값을 입력할 경우 **“[ERROR]”** 로 시작하는 에러메시지를 출력 후 입력을 다시받는다.  

## 기능 목록 

* 자동차
  [X] 차의 차이름 유효성 체크 기능
  - 차의 차이름은 5이하
  - 차의 차이름은 공백이 들어가면 안된다.

* 사용자가 시도하는 횟수를 입력하는 기능 
  * 숫자가 아니면 "[ERROR]" 메시지 출력하고 입력을 다시 받음  
  
  
* 자동차들의 이름을 입력 받는 기능
  * 쉼표(,)로 구별하며 구별수만큼 생성
  * 이름이 잘못 되면 "[ERROR]" 메시지를 출력하고 입력을 다시받음  

* 자동차가 랜덤값에 의해 전진 혹은 멈출 수 있는 기능
  * 랜덤값이 4이상이면 전진
  * 랜덤값이 3이하의 값이면 멈춤  


* 자동차가 주어진 횟수(사용자 시도 횟수) 동안 행위(전진,멈춤)을 수행한다.
  * 주어진 수 만큼 행위를 함  
  
* 모든 절차가 완료 되면 우승자 출력하는 기능
  * 우숭자를 찾기
    * 가장 먼거리를 간 사람
  * 우승자가 한명이상일 경우 "," 로 구분 