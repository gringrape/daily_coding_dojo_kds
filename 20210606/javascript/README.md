# 조이스틱
https://programmers.co.kr/learn/courses/30/lessons/42860
## 구하는 것
조이스틱 조작 횟수의 최소값
## 주어진 것
조이스틱으로 만들고자 하는 이름
## 조건
- 맨처음에는 A 로만 이루어짐
- 가장 왼쪽의 위치(처음 위치)에서 왼쪽을 한 번 더 누르면 가장 오른쪽으로 감
## 배운것
- 상태가 있는 경우를 구현해야 했다.
- 현재 위치에서 가장 가까운 다음 위치로 계속해서 이동해야 했다.
- 그래서 현재 위치를 상태로 설정하고 업데이트 해주었다. 
- 새로운 상태를 계산하는 책임을 가진 함수를 분리해주었다. 