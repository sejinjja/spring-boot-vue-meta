# 개요

 루트 폴더의 개념 없이 spring 프로젝트와 vue 프로젝트각 각각 독립적이며, 배포 폴더인 dist(**배포 폴더가 spring 프로젝트와 vue 프로젝트가 달라도 상관없습니다.**)에 둘 다 접근이 가능 할 때 사용 할 수 있습니다.
  
```bash
BackEnd
├─.mvn
│  └─wrapper
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─example
    │  │          └─backend
    │  │              └─controller
    │  └─resources
    └─test
        └─java
            └─com
                └─example
                    └─backend
FrontEnd
├─build
├─config
├─src
│  ├─assets
│  ├─components
│  └─router
└─static
dist
```
  두 프로젝트 빌드 순서 관련 없고, jvm 실행 옵션을 통하여, spring 프로젝트가 바라보는 resource 위치를 컨트롤 합니다.

# 빌드 방법

    /FrontEnd> mvn package
    /BackEnd> mvn package

## 실행 결과

```bash
dist
│  BackEnd-0.0.1-SNAPSHOT.jar
│  cmd.bat
│
└─resources
    ├─static
    │  └─static
    │      ├─css
    │      │      app.30790115300ab27614ce176899523b62.css
    │      │      app.30790115300ab27614ce176899523b62.css.map
    │      │
    │      └─js
    │              app.b22ce679862c47a75225.js
    │              app.b22ce679862c47a75225.js.map
    │              manifest.2ae2e69a05c33dfc65f8.js
    │              manifest.2ae2e69a05c33dfc65f8.js.map
    │              vendor.2420502e2b2c7f321d64.js
    │              vendor.2420502e2b2c7f321d64.js.map
    │
    └─templates
            index.html
 ```
 dist 폴더에 spring 프로젝트에서 만든 ~.jar 파일과 vue 프로젝트에서 만든 번들이 resouces 안으로 들어갑니다.
 ```bash
cmd.bat
java -Dspring.resources.static-locations=file:./resources/static -Dspring.thymeleaf.prefix=file:./resources/templates/ -jar *.jar
 ```
 실행 시 spring.resources.static-locations, spring.thymeleaf.prefix 해당 속성을 위와 같이 vue 프로젝트의 번들 위치로 변경 해 줍니다.
