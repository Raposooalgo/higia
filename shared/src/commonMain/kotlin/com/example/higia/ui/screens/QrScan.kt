package com.example.higia.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import higia.shared.generated.resources.Res
import higia.shared.generated.resources.qr_code_scanner
import org.jetbrains.compose.resources.painterResource

// Colores de la pantalla (gris verdoso del mockup)
private val FondoQr    = Color(0xFF6B7B6E)
private val Naranja    = Color(0xFFB85C1A)
private val PlaceholderCam = Color(0xFFB0B0B0)

@Composable
@Preview
fun QrScan() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoQr)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(64.dp))

            // Título
            Text(
                text = "QR Paciente",
                fontSize = 28.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Banner naranja
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Naranja, RoundedCornerShape(16.dp))
                    .padding(horizontal = 24.dp, vertical = 18.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Escanea el QR para\ncomenzar el turno",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Placeholder cámara
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .background(PlaceholderCam, RoundedCornerShape(16.dp))
            )
        }

        // Botón cámara centrado abajo
        IconButton(
            onClick = { /* TODO: activar cámara */ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp)
                .size(64.dp)
                .background(Naranja, CircleShape)
        ) {
            Icon(
                //painter = painterResource(Res.drawable.qr_code_scanner),
                imageVector = Icons.Filled.CameraAlt,
                contentDescription = "Abrir cámara",
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}