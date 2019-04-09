# Demo App to show Hibernate 2nd Level Cache

### Helpful Links

- [Medium Article 1](https://medium.com/@skywalkerhunter/speeding-up-your-hibernate-with-cache-level-2-ehcache-in-1-min-28255622bf6f)
- [Medium Article 2](https://medium.com/@skywalkerhunter/org-hibernate-orm-deprecation-caa816ba2755)
- [Enable some Statistics](https://docs.spring.io/spring-boot/docs/2.2.0.BUILD-SNAPSHOT/reference/html/production-ready-features.html#production-ready-metrics-hibernate)

### cURL Requests

Get List of Things
```
curl -X GET \
  http://localhost:8080/things \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache'
```

Create Thing
```
curl -X POST \
  http://localhost:8080/things \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{ "thing": "Beep" }'
```

Get Thing
```
curl -X GET \
  http://localhost:8080/things/1 \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache'
```

Get Actual Hibernate Statistic
```
curl -X GET \
  http://localhost:8080/actuator/metrics/hibernate.second.level.cache.requests \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache'
```

