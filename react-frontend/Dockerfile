# Sử dụng node image với phiên bản mong muốn
FROM node:14

# Thiết lập thư mục làm việc trong container
WORKDIR /react-frontend

# Sao chép các tệp package.json và package-lock.json vào thư mục làm việc
COPY package*.json ./

# Cài đặt các dependencies
RUN npm install

# Sao chép toàn bộ mã nguồn của ứng dụng vào thư mục làm việc
COPY . .

# Xây dựng ứng dụng React
RUN npm run build

# Expose cổng mà ứng dụng chạy trên
EXPOSE 3000

# Khởi chạy ứng dụng React khi container được chạy
CMD ["npm", "start"]