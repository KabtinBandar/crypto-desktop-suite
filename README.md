# Java Cryptography & Cybersecurity Desktop Suite

A modern desktop application built in **Java Swing** leveraging **FlatLaf**, **SVG Salamander**, and the **Java Cryptography Architecture (JCA)**. It provides a clean, responsive graphical interface for symmetric encryption (**AES**), asymmetric key-pair generation & encryption (**RSA**), and cryptographic hashing (**SHA-1**).

---

## Features

### 1. Symmetric Encryption — AES
- **Key Sizes:** Supports standard 128-bit, 192-bit, and 256-bit AES symmetric keys.
- **Modes:** Cipher Block Chaining (**CBC**) and Electronic Codebook (**ECB**).
- **Padding:** PKCS5Padding compliance with Base64 ciphertext encoding.
- **Decryption & Verification:** Decrypts encoded ciphertext back into plaintext with key validation.

### 2. Asymmetric Cryptography — RSA
- **Key-Pair Generation:** Generates cryptographically secure RSA key pairs in **512-bit**, **1024-bit**, and **2048-bit** lengths using `KeyPairGenerator`.
- **Public/Private Key Management:** Displays public and private key specifications encoded in Base64 (X.509 and PKCS#8 formats).
- **Encryption with Public Key:** Encrypts sensitive messages using the generated public key.
- **Decryption with Private Key:** Recovers original plaintext strictly using the paired private key.

### 3. Cryptographic Hashing — SHA-1
- Generates 160-bit SHA-1 message digests from arbitrary user text using `MessageDigest`.
- Real-time hash calculation to demonstrate cryptographic data integrity and avalanche effect.

### 4. Modern Desktop User Interface
- **Theme Engine:** Fully integrated **FlatLaf 3.3** modern dark and light theme switching.
- **Vector Icons:** Scalable vector graphics rendered dynamically via JSVG and SVG Salamander.
- **Smooth Navigation:** Animated collapsible sidebar menu, tab switching, and custom splash screen with progress bar.

---

## Project Structure

```
CyberSecuity/
├── src/
│   └── com/troy/
│       ├── application/
│       │   └── Application.java          # Main desktop launcher
│       ├── form/                         # Cryptography Functionality Forms
│       │   ├── AES_Encryption.java       # AES encryption & decryption panel
│       │   ├── RSA_Key.java              # RSA key pair generator & cipher panel
│       │   ├── SHA_1.java                # SHA-1 hash generator panel
│       │   └── Setting_Form.java         # Appearance and theme settings
│       ├── menu/                         # Modern Animated Navigation Bar
│       │   ├── Menu.java
│       │   └── mode/LightDarkMode.java   # Dark/Light theme coordinator
│       ├── splashscreen/                 # Custom Loading Splash Screen
│       │   ├── SplashScreen.java
│       │   └── ProgressBarCustom.java
│       └── theme/                        # FlatLaf Custom Color Themes
├── build.xml                             # Apache Ant build script
└── nbproject/                            # NetBeans project configuration
```

---

## Building and Running

### Prerequisites
- **Java SE Development Kit (JDK 17, 21, or 25)** installed.

### Option 1: Running in Any Modern Java IDE
1. Open the project in **IntelliJ IDEA**, **NetBeans**, or **Eclipse**.
2. Ensure the JAR libraries in the project root are included in your Module Dependencies:
   - `flatlaf-3.3.jar`
   - `flatlaf-extras-3.2.jar`
   - `jsvg-1.2.0.jar`
   - `svgSalamander-1.1.4.jar`
   - `miglayout-4.0.jar`
3. Run the main class: `com.troy.application.Application`.

### Option 2: Command Line (Javac)
```cmd
javac -cp ".;*.jar" -d bin src\com\troy\application\Application.java src\com\troy\form\*.java src\com\troy\menu\*.java
java -cp ".;bin;*.jar" com.troy.application.Application
```

---

## Verified Compiler Status
- **Java Compiler:** Verified on `javac 25.0.2` LTS.
- **Compilation Result:** 34 Java source files compiled with 0 errors.

---

## License
MIT License. Developed for software security and cryptography education.
