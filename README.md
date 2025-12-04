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

| Halaman Utama | Pilih Gejala | Hasil Diagnosa |
| :---: | :---: | :---: |
| <img src="PASTE_LINK_GAMBAR_1![SKRIPSI JAMRUD KHATULISTIWA Image 77](https://github.com/user-attachments/assets/efdd0d6f-1177-4f9b-947e-eb0942acf76d)
_DISINI" width="200"> | <img src="PASTE_LINK_GAMBAR_![SKRIPSI JAMRUD KHATULISTIWA Image 79](https://github.com/user-attachments/assets/e7e052bb-617e-42db-b6b4-31249d1869a1)
2_DISINI" width="200"> | <img src="PASTE_LINK_GAM![SKRIPSI JAMRUD KHATULISTIWA Image 80](https://github.com/user-attachments/assets/ad8696e2-e319-45c6-8c52-e05d89d60d9a)
BAR_3_DISINI" width="200"> |

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
