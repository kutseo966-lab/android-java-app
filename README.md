# 📱 Android Java App

Android приложение на Java с автоматической сборкой APK через GitHub Actions.

## 🚀 Возможности

- ✅ Простой и понятный UI
- ✅ Material Design
- ✅ Автоматическая сборка Debug и Release APK
- ✅ GitHub Actions CI/CD

## 📦 Сборка

Сборка происходит автоматически при пуше в `main` ветку.

### Debug APK
```bash
./gradlew assembleDebug
```

### Release APK
```bash
./gradlew assembleRelease
```

## 📥 Скачивание APK

1. Перейди в [Actions](https://github.com/kutseo966-lab/android-java-app/actions)
2. Выбери последний успешный запуск
3. Скачай артефакт `android-app-debug` или `android-app-release`

## 🛠️ Технологии

- Java 17
- Android SDK 34
- Gradle 8.0
- Material Components

---

Создано автоматически через Python-агент 🤖
