# 거리두기 확인하기
https://programmers.co.kr/learn/courses/30/lessons/81302

## 구하는 것
각 대기실 별로 거리두기를 지키고 있는지 여부 -> 배열 1, 0

## 주어진 것
- 응시자들의 정보와 대기실 구조 places
- 대기실은 다섯개
- 각 대기실은 5 X 5 

## 조건
### 두 사람 간의 거리두기
- 맨해튼 거리 2 초과는 O.K
- 2 이하 인 경우, 중간에 차단벽이 있다면 O.K.

## 계획
- 완전 탐색
- 모든 사람에 대해 1. 상하좌우 검사 2. 대각선 검사 를 진행 한다.
