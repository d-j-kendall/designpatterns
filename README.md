# designpatterns

Worked examples of a couple of classic design patterns in Java, written while studying them.

_Status: study notes (2022) · Java · Maven_

## What this covers

- **Prototype** (creational) — `src/main/java/creational/prototype/`: clone cached `BasicCar`
  prototypes (`Ford`, `Nano`) from a `BasicCarCache` instead of rebuilding them; `Demo` runs it.
- **Adapter** (structural) — `src/main/java/structural/adapter/`: a `MediaPlayer` that plays MP4 and
  VLC formats through an `AdvancedMediaPlayerAdapter`.

Each package has a small `Demo` / client `main` that exercises the pattern. Lombok trims the boilerplate.

## Run

```bash
mvn compile
```

Then run the `Demo` (prototype) or client `main` (adapter) for the pattern you want to see.

---
Built by **Dustin Kendall** — production readiness & rescue for AI-built apps.
[dustinkendall.com](https://dustinkendall.com) · [LinkedIn](https://www.linkedin.com/in/dustinjkendall)
