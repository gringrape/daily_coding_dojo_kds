# 구명보트
## 구하는 것
모든 사람을 구출하기 위한 구명보트 개수의 최솟값
## 주어진 것
갇힌 사람의 배열
무게 제한
## 조건
구명 보트 개수를 최대한 적게
한번에 두명 탈 수 있다 
구명보트의 무게 제한은 사람들의 몸무게 보다 크게 주어진다 -> 적어도 한사람 구조가능
## 계획
판단기준
- 한사람의 무게가 절반 이하인가? 
- 두사람의 무게는 무게 제한을 초과하는가?
### 할 일
배열을 정렬한다
정렬된 배열에서 가장 처음 원소가 무게를 초과하는지 검사한다.
정렬된 배열에서 앞에 두개 원소가 무게 제한을 초과하는지 검사한다.
