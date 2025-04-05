# 🎬 Sinema Müşteri Kayıt Sistemi (Java Console Uygulaması)

Bu Java konsol uygulaması, bir sinema işletmesi için temel **film tanımlama**, **müşteri kaydı** ve **bilet işlemleri** gibi işlevleri yerine getirmek üzere geliştirilmiştir. Kullanıcı dostu menüsü sayesinde, konsol üzerinden film ve müşteri bilgileri girilerek hızlıca bilet oluşturulabilir ve kayıtlar listelenebilir.

---

## 📌 Proje Özeti

Bu proje kapsamında geliştirilen sistemde:

- 🎞️ **Film Tanımlama:** Film adı, süresi ve türü girilir. Maksimum 10 film desteklenir.  
- 👤 **Müşteri Kaydı:** Müşteri adı ve e-posta bilgileri girilir. Maksimum 20 müşteri desteklenir.  
- 🎟️ **Bilet Kaydı:** Müşteri ve film eşleştirilerek bilet oluşturulur.  
- 📋 **Listeleme:** Mevcut bilet kayıtları müşteri bazında görüntülenebilir.

---

## 🧩 Uygulama Özellikleri

- ✅ Konsol üzerinden etkileşimli menü  
- ✅ Film & müşteri bilgilerini dizilerde saklama  
- ✅ Müşteri-film eşleşmesini çift boyutlu dizi ile yönetme  
- ✅ Kolay anlaşılır kullanıcı deneyimi  

---

## 📂 Dosya Yapısı

```
📁 sinema-kayit-sistemi
 ┣ 📄 SinemaMusteriKayitSistemi.java
 ┗ 📄 README.md
```

---

## ⚙️ Derleme ve Çalıştırma

### 1. Kodu klonlayın:
```bash
git clone https://github.com/kullanici-adi/sinema-kayit-sistemi.git
cd sinema-kayit-sistemi
```

### 2. Derleyin ve çalıştırın:
```bash
javac SinemaMusteriKayitSistemi.java
java SinemaMusteriKayitSistemi
```

---

## 🖥️ Konsol Menüsü

```text
1 - Film Ekle
2 - Müşteri Ekle
3 - Bilet Kaydı
4 - Biletleri Listele
5 - Çıkış
```

---

## 🔐 Veri Yapıları

| Veri Türü     | Değişken Adı       | Açıklama                    |
|---------------|--------------------|-----------------------------|
| `String[]`    | `filmAdi`          | Film adları                 |
| `int[]`       | `filmSure`         | Film süreleri (dakika)      |
| `String[]`    | `filmTur`          | Film türleri                |
| `String[]`    | `musteriAdi`       | Müşteri adları              |
| `String[]`    | `musteriEmail`     | Müşteri e-posta adresleri   |
| `String[][]`  | `biletler`         | Müşteri-film eşleşme tablosu|

---

## 💡 Geliştirme Önerileri

- 🔄 Film veya müşteri güncelleme/silme işlemleri
- 💾 Dosya sistemi (I/O) kullanarak veri kaydı ve yükleme
- 🖼️ Swing veya JavaFX ile GUI (Grafiksel Arayüz) geliştirme
- 🆔 Bilet numarası ve tarih bilgisi eklenmesi
- 📦 JSON/XML ile veri saklama desteği

---

## 📅 Teslim Bilgisi

- **Teslim Tarihi:** `03.04.2025 - 23:59`  
- **Teslim Yeri:** GitHub üzerinden paylaşılacak ve OIS sistemine bağlantı eklenecek.  
- **Geliştirici:** Emrah Sarıçiçek  
- **E-posta:** emrah@example.com *(örnektir)*  

---

## 📜 Lisans

Bu proje sadece eğitim amaçlı hazırlanmıştır ve herhangi bir ticari kullanım içermez.
