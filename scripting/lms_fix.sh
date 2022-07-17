#!/usr/bin/bash

cd
sudo apt install build-essential checkinstall zlib1g-dev make wget -y
wget https://artfiles.org/openssl.org/source/openssl-1.1.1n.tar.gz
sleep 3
echo "packages installed."
sudo tar -xf openssl*.tar.gz
cd openssl-1.1.1n
echo "running config..."
sleep 3
sudo ./config --prefix=/usr/local/ssl --openssldir=/usr/local/ssl/ shared zlib
sudo make
sudo make install
sleep 3
echo "configuration complete. exporting libraries..."
export LD_LIBRARY_PATH=/usr/local/lib:/usr/local/lib64:/usr/local/ssl/lib:$LD_LIBRARY_PATH

sudo ldconfig
sleep 3

echo "setup complete..."
