# 개요

스프링 부트 프로젝트 안에 vue프로젝트가 있는 방식입니다.
  

```bash
NestedFront (**Spring Project**)
├─.mvn
│  └─wrapper
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─example
    │  │          └─springvue
    │  │              └─com
    │  │                  └─example
    │  │                      └─springvue
    │  │                          ├─controller
    │  │                          └─dao
    │  ├─resources
    │  └─vue-project (**vue project**)
    │      ├─build
    │      ├─config
    │      ├─src
    │      │  ├─assets
    │      │  ├─components
    │      │  └─router
    │      └─static
    └─test
        └─java
            └─com
                └─example
                    └─springvue
```

# 빌드 방법

    /NestedFront> mvn package

## 실행 결과

vue 프로젝트를 먼저 빌드를 하고, 빌드가 될 때, 스프링 부트 프로젝트의 resouces에 위치에 배포가 되기 때문에, 메이븐의 빌드 기본 위치인 /NestedFront/target/~.jar에 위치 하게 됩니다.
