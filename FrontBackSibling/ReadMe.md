# 개요

루트에 maven 프로젝트가 있고, 자식으로 vue 프로젝트와 Spring 프로젝트가 있는 구조 입니다.


```bash
FrontBackSibling (**maven project**)
├─BackEnd (**spring project**)
│  ├─.mvn
│  │  └─wrapper
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─example
│      │  │          └─backend
│      │  │              ├─contoller
│      │  │              └─dao
│      │  └─resources
│      └─test
│          └─java
│              └─com
│                  └─example
│                      └─backend
├─FrontEnd (**vue project**)
│   ├─build
│   ├─config
│   ├─src
│   │  ├─assets
│   │  ├─components
│   │  └─router
│   └─static
└─pom.xml
```

# 빌드 방법

    /FrontBackSibling> mvn package

## 실행 결과

vue 프로젝트를 먼저 빌드를 하고, 스프링 부트 프로젝트가 될 때, vue 프로젝트의 번들을 끌어와서 스프링 프로젝트를 패키징 합니다. 결과물은 메이븐의 빌드 기본 위치인 /FrontBackSibling/BackEnd/target/~.jar에 위치 하게 됩니다.
