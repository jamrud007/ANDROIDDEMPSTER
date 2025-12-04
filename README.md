# 🦷 Dental Expert System (Sistem Pakar Penyakit Gigi)

![Java](https://img.shields.io/badge/Language-Java-orange) ![Platform](https://img.shields.io/badge/Platform-Android-green) ![Method](https://img.shields.io/badge/Method-Dempster%20Shafer-blue)

An Android-based Expert System developed to diagnose dental diseases based on user symptoms. This project was developed as a **Bachelor's Thesis (Skripsi)** at Universitas Negeri Medan.

Using the **Dempster-Shafer** method, this application calculates the probability of diseases by combining various evidences (symptoms) to handle uncertainty in medical diagnosis.

## 📱 Project Overview

* **Topic:** Expert System for Dental Disease Identification.
* **Algorithm:** Dempster-Shafer Theory of Evidence.
* **Target User:** General public (for early diagnosis) and Medical Students.
* **Result:** The system achieved a **90.89% accuracy rate** when validated against expert (dentist) data.

## 🚀 Key Features

* **Symptom Selection:** Interactive UI for users to select experienced symptoms.
* **Real-time Diagnosis:** Instant calculation of disease probability using the Dempster-Shafer algorithm.
* **Disease Information:** Detailed explanation of the diagnosed disease and suggested treatments.
* **Knowledge Base:** Based on data acquired from real dental experts.

## 🧠 How Dempster-Shafer Works in This App

The Dempster-Shafer theory allows the system to combine separate pieces of information (symptoms) to calculate the "Belief" (Bel) and "Plausibility" (Pl) of a specific disease.

1.  **Input:** User selects symptoms (e.g., "Bleeding gums", "Bad breath").
2.  **Processing:** The system looks up the *Density* value for each symptom from the database.
3.  **Calculation:** It applies the Dempster rule of combination to merge these values.
4.  **Output:** The system presents the disease with the highest percentage of belief.

## 🛠️ Tech Stack

* **Language:** Java
* **IDE:** Android Studio
* **Database:** SQLite / Firebase (Sesuaikan dengan yang Anda pakai)
* **UI/UX:** XML

## 📸 Screenshots

| Home Screen | Symptom Selection | Diagnosis Result |
|:---:|:---:|:---:|
| ![Home](link_to_image_![SKRIPSI JAMRUD KHATULISTIWA Image 77](https://github.com/user-attachments/assets/b236e98e-a969-45c3-ac14-1e58ef7be355)
1.png) | ![Selection](link_to_ima![SKRIPSI JAMRUD KHATULISTIWA Image 79](https://github.com/user-attachments/assets/265648d5-600e-4984-8c65-63958ff4e620)
ge_2.png) | ![Result](link_to_i![SKRIPSI JAMRUD KHATULISTIWA Image 80](https://github.com/user-attachments/assets/5fe3200e-9c56-4e10-8f53-b4fec5c40c7c)
mage_3.png) |

*(Note: Upload screenshots to your repo and link them here)*

## 🔬 Validation & Testing

This application underwent rigorous testing comparing the system's output with manual diagnosis by dentists.
* **Test Cases:** [Jumlah Data Uji] patient records.
* **Accuracy:** 90.89%

## 👨‍💻 Author

**Jamrud Khatulistiwa**
* Computer Science Graduate, Universitas Negeri Medan
* [LinkedIn Profile](https://www.linkedin.com/in/jamrud-khatulistiwa/)

---
*Created for educational and research purposes.*
