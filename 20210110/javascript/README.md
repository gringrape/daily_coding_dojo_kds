# 폰켓몬
https://programmers.co.kr/learn/courses/30/lessons/1845
## 분석
- 입력: 폰켓몬의 종류 번호가 담겨진 배열
- 출력: 폰켓몬 종류 번호의 개수
### 선택 조건
- 가장 많은 종류 선택
- 폰켓몬이 총 N 마리 일때, N/2 마리를 가질 수 있음.
- N 은 짝수
### 예시
- 입력 [3, 1, 2, 3]
- [3, 1], [3, 2], [3, 3], [1, 2], [1, 3], [2, 3] 총 여섯가지 방법
- 이 중 두 종류를 고르는 것이 최댓값
## 계획
- N / 2 개를 고르기 -> 조합
- 종류가 몇가지 인지 세기 
- 가지수 중에서 최대인 것을 반환