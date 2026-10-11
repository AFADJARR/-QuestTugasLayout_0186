package com.example.tugasp4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp)
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.Prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ItemCard(
                namaRes = R.string.nama1,
                telpRes = R.string.telp1,
                alamatRes = R.string.alamat1,
                colorRes = R.color.card_gray,
                logoRes = R.drawable.logo
            )
            ItemCard(
                namaRes = R.string.nama2,
                telpRes = R.string.telp2,
                alamatRes = R.string.alamat2,
                colorRes = R.color.card_purple,
                logoRes = R.drawable.logo
            )
            ItemCard(
                namaRes = R.string.nama3,
                telpRes = R.string.telp3,
                alamatRes = R.string.alamat3,
                colorRes = R.color.card_blue,
                logoRes = R.drawable.logo
            )
            ItemCard(
                namaRes = R.string.nama4,
                telpRes = R.string.telp4,
                alamatRes = R.string.alamat4,
                colorRes = R.color.card_green,
                logoRes = R.drawable.logo
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.copy),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun ItemCard(
    namaRes: Int,
    telpRes: Int,
    alamatRes: Int,
    colorRes: Int,
    logoRes: Int
)
