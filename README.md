# Firebase To-Do App with Priority Management

A reactive, priority-based To-Do application built with **Jetpack Compose**, **Material 3**, and **Firebase Realtime Database**.

---

## Features
- **Real-time Synchronization:** Powered by Firebase Realtime Database with coroutine-based `callbackFlow` observation.
- **Priority Management:** Tasks are color-coded and dynamically sorted by priority (**High** → **Medium** → **Low**).
- **Full CRUD Operations:**
  - **Create:** Add tasks with customizable priority.
  - **Read:** Live updates stream directly from Firebase to Compose state.
  - **Update:** Edit task description and priority levels.
  - **Delete:** Interactive swipe-to-delete with `SwipeToDismissBox` or button delete.
- **Modern Jetpack Compose Architecture:** Clean MVVM structure with `StateFlow` and Unidirectional Data Flow (UDF).

---

## Tech Stack
- **Language:** Kotlin
- **UI Toolkit:** Jetpack Compose + Material 3
- **Architecture:** MVVM (Model-View-ViewModel)
- **Backend / Database:** Firebase Realtime Database
- **Asynchronous / State:** Kotlin Coroutines & `StateFlow`
- **Build System:** Gradle (Kotlin DSL + Version Catalog)

---

## Setup & Running
1. Clone the repository:
   ```bash
   git clone https://github.com/ManyaNayak1012/Firebase_To_Do_UsingCompose.git
   ```
2. Open the project in **Android Studio**.
3. Let Gradle sync dependencies.
4. Run the app on an Android device or emulator (API 26+).
