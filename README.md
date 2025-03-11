# 🏠 Smart Home Automation API (Spring Boot)  

This is a **Smart Home Automation API** built using **Spring Boot** that allows you to:  
✅ Control home devices like **Lights, Fans, AC, etc.** through REST APIs.  
✅ Turn devices **ON** or **OFF** using simple HTTP requests.  
✅ Get the current status of any device.  
✅ Uses **in-memory storage (ArrayList)** to manage device states — **no database used**.  

---

## 💡 Features  
- ✅ **Turn ON/OFF** devices like Lights, Fans, AC, etc.  
- ✅ **Check the status** of any device.  
- ✅ Simple REST API without database integration.  
- ✅ Easy to extend in the future (e.g., add sensors, voice control, etc.).  

---

## 📊 API Endpoints  
Here are the available API endpoints:  

### **1. Turn ON a Device**  
**Endpoint:**  
```plaintext
POST: http://localhost:8080/devices/on
```  

**Request Body (JSON):**  
```json
{
  "deviceName": "Light"
}
```  

**Response:**  
```plaintext
✅ Light turned ON successfully.
```  

---

### **2. Turn OFF a Device**  
**Endpoint:**  
```plaintext
POST: http://localhost:8080/devices/off
```  

**Request Body (JSON):**  
```json
{
  "deviceName": "Fan"
}
```  

**Response:**  
```plaintext
✅ Fan turned OFF successfully.
```  

---

### **3. Get Device Status**  
**Endpoint:**  
```plaintext
GET: http://localhost:8080/devices/status
```  

**Response:**  
```json
[
  {
    "deviceName": "Light",
    "status": "ON"
  },
  {
    "deviceName": "Fan",
    "status": "OFF"
  }
]
```  

---

## 💻 How to Run This Project  
### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/Smart-Home-Automation.git
cd Smart-Home-Automation
```  

---

### 2️⃣ Build the Project  
If you are using **Maven**, simply run:  
```bash
mvn clean install
```  

---

### 3️⃣ Run the Application  
Start the project using:  
```bash
mvn spring-boot:run
```  

Or if you're using IntelliJ/Eclipse:  
- Run the `SmartHomeApplication` class.  

---

### 4️⃣ Test the Endpoints  
You can use **Postman** or **cURL** to test the APIs:  

✅ **Turn On Light:**  
```plaintext
POST: http://localhost:8080/devices/on
Body: { "deviceName": "Light" }
```  

✅ **Turn Off Fan:**  
```plaintext
POST: http://localhost:8080/devices/off
Body: { "deviceName": "Fan" }
```  

✅ **Get All Device Status:**  
```plaintext
GET: http://localhost:8080/devices/status
```  

---

## 📟 Expected Output  
After turning on a Light and turning off a Fan, the response will look like:  
```json
[
  {
    "deviceName": "Light",
    "status": "ON"
  },
  {
    "deviceName": "Fan",
    "status": "OFF"
  }
]
```  

---

## ✅ Supported Devices  
The following devices are supported in this version:  
| Device Name     | Can Turn ON/OFF?     | Status API Supported?     |  
|-----------------|--------------------|---------------------------|  
| 💡 Light        | ✅ Yes               | ✅ Yes                    |  
| 🌀 Fan          | ✅ Yes               | ✅ Yes                    |  
| ❄️ AC           | ✅ Yes               | ✅ Yes                    |  
| 📺 TV           | ✅ Yes               | ✅ Yes                    |  

---

