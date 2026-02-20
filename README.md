# 🛠️ Multi-Language Dev Toolkit

A curated collection of essential commands for **Java**, **Python**, and **Linux**. This repository serves as a quick-start guide for setting up environments and executing scripts across different platforms.

---

## 📖 Table of Contents
* [Java (Compiled)](#1-java-the-compiled-workflow)
* [Python (Interpreted)](#2-python-the-scripting-workflow)
* [Linux (OS Operations)](#3-linux-the-os-workflow)
* [Contributing](#-contributing)
* [License](#-license)

---

## ☕ 1. Java (The Compiled Workflow)
Java follows the "Write Once, Run Anywhere" philosophy. It requires a compilation step to transform human-readable code into bytecode.

| Action | Command | Context |
| :--- | :--- | :--- |
| **Check Env** | `java -version` | Verifies the Runtime (JRE) is installed. |
| **Compile** | `javac FileName.java` | Generates a `.class` bytecode file. |
| **Execute** | `java FileName` | Runs the bytecode (skip the `.class` extension). |

> **Pro Tip:** Use `java FileName.java` (Java 11+) to run a single-file program without manually compiling it first!

---

## 🐍 2. Python (The Scripting Workflow)
Python is a high-level, interpreted language. It is widely used for data science, automation, and web development.

| Action | Command | Context |
| :--- | :--- | :--- |
| **Version** | `python3 --version` | Confirms you are on Python 3.x. |
| **Run** | `python3 app.py` | Executes the script immediately. |
| **Venv** | `python3 -m venv venv` | Creates an isolated environment. |

* **Package Management:** Use `pip install <package>` to add libraries.
* **Environment Activation:**
    * **Linux/macOS:** `source venv/bin/activate`
    * **Windows:** `.\venv\Scripts\activate`

---

## 🐧 3. Linux (The OS Workflow)
The command line is the foundation of server management and cloud infrastructure.

| Action | Command | Context |
| :--- | :--- | :--- |
| **List** | `ls -lha` | Shows all files including hidden ones. |
| **Location** | `pwd` | Displays your current directory path. |
| **Permissions** | `chmod +x file.sh` | Grants execution rights to a script. |

### 🛡️ Common Fixes
* **Permission Denied?** Use `sudo` before your command to run as an administrator.
* **Locked out of a file?** Use `chown user:group filename` to change ownership.

---

## 🤝 Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create.

1. **Fork** the Project
2. **Create** your Feature Branch (`git checkout -b feature/NewCommand`)
3. **Commit** your Changes (`git commit -m 'Add some NewCommand'`)
4. **Push** to the Branch (`git push origin feature/NewCommand`)
5. **Open** a Pull Request

---

## 📜 License
Distributed under the **MIT License**. See `LICENSE` for more information.

---
**Maintained by:** [Your Name/Github Username]