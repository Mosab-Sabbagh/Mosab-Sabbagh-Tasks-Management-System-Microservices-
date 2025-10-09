
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
# نستخدم صورة Java 17 خفيفة
FROM openjdk:17-jdk-slim

# نحدد مكان العمل داخل الحاوية
WORKDIR /app

# ننسخ ملف الـ jar الناتج بعد البناء
COPY build/libs/*.jar app.jar

# نفتح البورت الخاص بالسيرفس
EXPOSE 8081

# نشغل التطبيق
ENTRYPOINT ["java", "-jar", "app.jar"]
