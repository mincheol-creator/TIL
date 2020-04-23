# Git

- 코드관리 -> Source code Management -> Version Control System

- 협업도구
  - Pull & Push
  - Fork & PR
  - Shared Repository with Branching (Branch)

- 배포도구



### 1. 코드 관리 도구

#### (1) SCM(Source Code Management)

-> how? 버전을 통해 관리(Version Control System)

-> by what? 디렉토리 중심(Repository)

#### (2) 코드 관리를 위한 기본 명령어

##### 1.  git init

- .git 폴더 생성 : git 관련 데이터들이 저장된 폴더
- (master) 프롬프트
- rm -rf .git -> git을 새로 시작하고 싶을때 .git폴더를 삭제한다.



(git status -> git diff -> git add 파일명 -> git status -> git commit -m "~~~" -> git log --oneline)



#### 2. git status

- 현재 git 저장소(repository)의 상태를 확인

  

#### 3. git add [파일명/폴더명]

- staging Area에 파일 추가 

#### 4. git commit -m [메시지]

- 스냅샷 저장 (버전을 생성)

#### 5. git log

- 현재까지의 저장된 버전을 조회
- git log --oneline



### (3) 원격 저장소 관련 명령어

#### 1. git remote

- 현재 설정된 모든 원격 저장소에 관한 정보를 조회



#### 2. git remote add [저장소의 별명] [저장소의 주소]

- git remote add origin https://github.com/mincheol-creator/test_repo



#### 3. git push [저장소의 별명] [브렌치의 이름]

- git push origin master



#### 4. git clone [저장소의 주소] [디렉토리 이름]



### (4) Branch

# "브랜치는 일회용" : 더이상 쓰이지 않는 브랜치는 항상 정리 필요

#### 1. git branch

- 현재 브랜치를 조회

#### 2. git branch [브랜치명]

- 새로운 브랜치를 생성

#### 3. git checkout [브랜치명]

- 브랜치 이동

#### 4. git merge [합칠브랜치명]

- (주의) master에서 test를 병합할때, merge전에 master로 이동 후 merge를 진행해야 함
- git checkout master => git merge test

#### 5. git branch -d [삭제할브랜치명] / git branch -D [살제할브랜치명]

- -d 는 이미 병합된 브랜치를 삭제할 경우 : soft deletion
- -D 는 병합되지 않은 브랜치를 삭제할 경우 : hard deletion

### (5) Merge 시나리오

#### 1. Fast-Forward Merge

#### 2. Auto Merge

#### 3. Merge Conflict



## 2. 협업도구

#### (1) Push & Pull 모델 (끝말잇기)

- Synchronous 작업
- 해당 프로젝트에 대한 push 권한이 있어야함 (공동작업자로 초대)



#### (2) Fork & Pull Request 모델 (백일장)

- 나의 Github로 Fork & 나의 Github에 push
- pull Request를 통한 코드 반영 제안