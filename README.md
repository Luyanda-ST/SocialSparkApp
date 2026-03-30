# SocialSpark ✨

[![Platform](https://img.shields.io/badge/Platform-Android-brightgreen.svg)](https://developer.android.com)  
[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org)  
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

SocialSpark is a simple Android app that gives users message suggestions based on the time of day, helping them stay connected with friends and family effortlessly.

---

## 📱 <img width="638" height="1084" alt="Screenshot 2026-03-30 204506" src="https://github.com/user-attachments/assets/5c2ae189-5d29-4865-9d29-94a1128b3219" />



| Home Screen | Input & Suggestion |
|:---:|:---:|
| <img src="screenshots/home.png" width="200"> | <img src="screenshots/suggestion_example.png" width="200"> |

---

## ✨ Features

* **Time-based Suggestions:** Provides different message suggestions based on Morning, Mid-Morning, Afternoon, Dinner, Night, etc.
* **Reset Functionality:** Quickly clears input and suggestions.
* **User-Friendly UI:** Clean interface with CardView elements and easy navigation.
* **Customizable Input:** Accepts flexible text input from the user.

---

## 🛠 Tech Stack & Libraries

* **Language:** Kotlin  
* **UI Framework:** XML Layouts with ConstraintLayout & CardView  
* **Architecture:** Simple Activity-based logic  
* **Asynchronous Programming:** None needed (basic UI)  
* **Dependencies:** AndroidX libraries, Material Design Components

---

## 🚀 Getting Started

Follow these steps to get a local copy up and running.

### Prerequisites
* Android Studio **Chipmunk or newer**  
* Android SDK Level **34** or newer  
* A physical device or emulator running Android **8.0 (Oreo)** or higher

### Installation
1. **Clone the repository:**
    ```bash
    git clone https://github.com/Luyanda-ST/SocialSpark.git
    ```
2. **Open the project in Android Studio:**  
   Go to **File > Open** and select the cloned folder.
3. **Sync Gradle:**  
   Allow Android Studio to download dependencies and sync Gradle.
4. **Run the app:**  
   Click the **Run** button (green play icon) in the toolbar.

---

## 📂 Project Structure

```text
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/socialspark/   # MainActivity and Kotlin logic
│   │   ├── res/                            # Layouts, Drawables, Values
│   │   └── AndroidManifest.xml
│   └── test/                               # Unit tests
└── build.gradle                             # App-level build configurations
