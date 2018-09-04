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

vue 프로젝트를 먼저 빌드를 하고, 번들된 결과가 스프링 부트 프로젝트의 resouces에 위치에 배포가 되고나서 스프링 부트 프로젝트가 빌드를 합니다. 결과물은 메이븐의 빌드 기본 위치인 /NestedFront/target/~.jar에 위치 하게 됩니다.
